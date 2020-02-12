package com.marcoscg.licenser;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @MarcosCGdev on 11/02/2018.
 */

public class Licenser {

    private List<Library> apacheLibraries;
    private List<Library> mitLibraries;
    private List<Library> gnuLibraries;
    private List<Library> creativeCommonsLibraries;
    private List<Library> iscLibraries;
    private List<Library> ntpLibraries;
    private List<Library> apache1Libraries;
    private List<Library> apache11Libraries;
    private List<Library> bsdLibraries;
    private List<Library> bsd4Libraries;
    private List<Library> freeBsdLibraries;
    private List<Library> bslLibraries;
    private List<Library> bsdPatentLibraries;
    private List<Library> gnu2Libraries;
    private List<Library> gnu21Libraries;

    private StringBuilder stringBuilder;
    private String noticeTitle = "Notices for files:";
    private int backgroundColor = -1;
    
    public Licenser() {

        apacheLibraries = new ArrayList<>();
        gnu2Libraries = new ArrayList<>();
        gnu21Libraries = new ArrayList<>();
        bsdPatentLibraries = new ArrayList<>();
        bslLibraries = new ArrayList<>();
        freeBsdLibraries = new ArrayList<>();
        bsdLibraries = new ArrayList<>();
        bsd4Libraries = new ArrayList<>();
        apache11Libraries = new ArrayList<>();
        apache1Libraries=new ArrayList<>();
        mitLibraries = new ArrayList<>();
        gnuLibraries = new ArrayList<>();
        creativeCommonsLibraries = new ArrayList<>();
        iscLibraries = new ArrayList<>();
        ntpLibraries = new ArrayList<>();
        stringBuilder = new StringBuilder();

        stringBuilder.append("<html><head>");
        stringBuilder.append("<meta charset=\"utf-8\">\n");
        stringBuilder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
        stringBuilder.append("<style>body{font-family:sans-serif;margin:0;padding-left:8px;padding-right:8px;}li{margin:0 0 4px;}" +
                "pre{padding:1em;white-space:pre-wrap;margin: 0;}h3{margin-left: 16px;}ul{margin-top: -12px;}</style>\n");
        stringBuilder.append("</head><body>");
    }

    public Licenser setLibrary(Library library) {
        if (library.getLicense()==License.APACHE)
            apacheLibraries.add(library);
        else if (library.getLicense()==License.MIT)
            mitLibraries.add(library);
        else if (library.getLicense()==License.GNU)
            gnuLibraries.add(library);
        else if (library.getLicense()==License.CREATIVE_COMMONS)
            creativeCommonsLibraries.add(library);
        else if (library.getLicense()==License.ISC)
            iscLibraries.add(library);
        else if (library.getLicense()==License.NTP)
            ntpLibraries.add(library);
        else if (library.getLicense()==License.APACHEv1)
            apache1Libraries.add(library);
        else if (library.getLicense()==License.APACHEv11)
            apache11Libraries.add(library);
        else if (library.getLicense()==License.BSD3)
            bsdLibraries.add(library);
        else if (library.getLicense()==License.BSD4)
            bsd4Libraries.add(library);
        else if (library.getLicense()==License.FREEBSD)
            freeBsdLibraries.add(library);
        else if (library.getLicense()==License.BSL)
            bslLibraries.add(library);
        else if (library.getLicense()==License.GNU2)
            gnu2Libraries.add(library);
        else if (library.getLicense()==License.GNU21)
            gnu21Libraries.add(library);
        return this;
    }

    public Licenser setCustomNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
        return this;
    }

    public String getHTMLContent() {
        prepare();
        stringBuilder.append("</body></html>");
        return stringBuilder.toString();
    }

    public Licenser setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    String getHTMLContent(Context context) {
        if (backgroundColor==-1)
            backgroundColor = Utils.getThemeColor(context, R.attr.colorBackgroundFloating);

        int preColor = Utils.darkenColor(backgroundColor);
        int textColor = Color.BLACK;

        if (!Utils.isColorLight(backgroundColor)) {
            preColor = Utils.lightenColor(backgroundColor);
            textColor = Color.WHITE;
        }

        stringBuilder.append("<style>body{background-color:"+Utils.colorHex(backgroundColor)+";color:"+Utils.colorHex(textColor)+";}" +
                "a{color:"+Utils.colorHex(textColor)+";}pre{background-color:"+Utils.colorHex(preColor)+";color:"+Utils.colorHex(textColor)+";}</style>");
        return getHTMLContent();
    }

    public List<Library> getApacheLibraries() {
        return apacheLibraries;
    }

    public List<Library> getMitLibraries() {
        return mitLibraries;
    }

    public List<Library> getGnuLibraries() {
        return gnuLibraries;
    }

    public List<Library> getCreativeCommonsLibraries() {
        return creativeCommonsLibraries;
    }

    public List<Library> getIscLibraries() {
        return iscLibraries;
    }

    public List<Library> getNtpLibraries() {
        return ntpLibraries;
    }

    private void prepare() {
        if (apacheLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:apacheLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getApacheLicense()+"</pre>");
        }

        if (bsdLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:bsdLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getBSD3License()+"</pre>");
        }

        if (freeBsdLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:freeBsdLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getFreeBSDLicense()+"</pre>");
        }

        if (bsdPatentLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:bsdPatentLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getBSDPatentLicense()+"</pre>");
        }

        if (bslLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:bslLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getBSLLicense()+"</pre>");
        }

        if (gnu2Libraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:gnu2Libraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getGNU2License()+"</pre>");
        }

        if (gnu21Libraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:gnu21Libraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getGNU21License()+"</pre>");
        }

        if (bsd4Libraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:bsd4Libraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getBSD4License()+"</pre>");
        }

        if (apache11Libraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:apache11Libraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getApache11License()+"</pre>");
        }
        if (apache1Libraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:apache1Libraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getApache1License()+"</pre>");
        }

        if (mitLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:mitLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getMITLicense()+"</pre>");
        }

        if (gnuLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:gnuLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getGNULicense()+"</pre>");
        }

        if (creativeCommonsLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:creativeCommonsLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getCreativeCommonsLicense()+"</pre>");
        }

        if (iscLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:iscLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getISCLicense()+"</pre>");
        }

        if (ntpLibraries.size()>0) {
            stringBuilder.append("<h3>"+noticeTitle+"</h3>");
            stringBuilder.append("<ul>");
            for (Library library:ntpLibraries) {
                if (library.getUrl() == null)
                    stringBuilder.append("<li><b>"+library.getTitle()+"</b></li>");
                else
                    stringBuilder.append("<li><a href=\""+library.getUrl()+"\"><b>"+library.getTitle()+"</b></a></li>");
            }
            stringBuilder.append("</ul>");
            stringBuilder.append("<pre>"+License.getNTPLicense()+"</pre>");
        }
    }

    public List<Library> getApache1Libraries() {
        return apache1Libraries;
    }

    public void setApache1Libraries(List<Library> apache1Libraries) {
        this.apache1Libraries = apache1Libraries;
    }

    public List<Library> getApache11Libraries() {
        return apache11Libraries;
    }
}
