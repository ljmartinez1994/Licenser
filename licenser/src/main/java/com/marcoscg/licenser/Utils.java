package com.marcoscg.licenser;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.util.Xml;

import androidx.annotation.ColorInt;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.xmlpull.v1.XmlPullParser.START_TAG;

/**
 * Created by @MarcosCGdev on 11/02/2018.
 */

public class Utils {

    static int getThemeColor(Context context, int attr) {
        TypedValue typedValue = new TypedValue();

        if (context.getTheme().resolveAttribute(attr, typedValue, true)) {
            return typedValue.data;
        }

        return Color.WHITE;
    }

    static String colorHex(@ColorInt int color) {
        return String.format("#%06X", (0xFFFFFF & color));
    }

    static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    static boolean isColorLight(@ColorInt int color) {
        if (color == Color.BLACK) return false;
        else if (color == Color.WHITE || color == Color.TRANSPARENT) return true;

        final double darkness = 1 - (0.299 * Color.red(color) + 0.587 * Color.green(color) + 0.114 * Color.blue(color)) / 255;

        return darkness < 0.4;
    }

    static int darkenColor(@ColorInt int color) {
        float[] hsv = new float[3];

        Color.colorToHSV(color, hsv);
        hsv[2] *= 0.8f;

        return Color.HSVToColor(hsv);
    }

    static int lightenColor(@ColorInt int color) {
        float fraction = 0.15f;

        int alpha = Color.alpha(color);
        int red = Math.round(Math.min(255, Color.red(color) + 255 * fraction));
        int green = Math.round(Math.min(255, Color.green(color) + 255 * fraction));
        int blue = Math.round(Math.min(255, Color.blue(color) + 255 * fraction));

        return Color.argb(alpha, red, green, blue);
    }


    public List<Library> getNotices(String fileName, Context context) {
        List<Library> noticias = null;
        XmlPullParser parser = Xml.newPullParser();
        String xmlString = null;
        AssetManager am = context.getAssets();
        try {
            InputStream is = am.open(fileName);
            parser.setInput(is, null);
            int evento = parser.getEventType();
            Library noticiaActual = null;
            while (evento != XmlPullParser.END_DOCUMENT) {
                String etiqueta = null;
                switch (evento) {
                    case XmlPullParser.START_DOCUMENT:
                        noticias = new ArrayList<Library>();
                        break;
                    case START_TAG:
                        etiqueta = parser.getName();
                        System.out.println("############### "+etiqueta);
                        if (etiqueta.equals("notice")) {
                            noticiaActual = new Library();
                        } else if (noticiaActual != null) {
                            if (etiqueta.equals("name")) {
                                noticiaActual.setTitle(parser.nextText());
                            } else if (etiqueta.equals("url")) {
                                noticiaActual.setUrl(
                                        parser.nextText());
                            } else if (etiqueta.equals("license")) {
                                String s=parser.nextText();
                                System.out.println(new License().getLicenseCode(s)+" $$$$$$$$$$$$$$$$$$$$$$$$ "+s);
                                noticiaActual.setLicense(new License().getLicenseCode(s));
                            }
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        etiqueta = parser.getName();
//                        System.out.println("###############2 "+etiqueta);
                        if (etiqueta.equals("notice") && noticiaActual != null) {
                            noticias.add(noticiaActual);
                        }           // Fin de condicional
                        break;
                }
                evento = parser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return noticias;
    }

}
