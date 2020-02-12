package com.marcoscg.licenser;

/**
 * Created by @MarcosCGdev on 11/02/2018.
 */

public class License {

    public static int APACHE = 1;
    public static int MIT = 2;
    public static int GNU = 3;
    public static int CREATIVE_COMMONS = 4;
    public static int ISC = 5;
    public static int NTP = 6;
    public static int APACHEv1 = 7;
    public static int APACHEv11 = 8;
    public static int BSD3 = 9;
    public static int BSD4 = 10;
    public static int FREEBSD = 11;
    public static int BSL = 12;
    public static int GNU2 = 13;
    public static int GNU21 = 14;

    static String getApacheLicense() {
        return "Licensed under the Apache License, Version 2.0 (the \"License\").<br>" +
                "<br>" +
                "You may not use this file except in compliance with the License.<br>" +
                "You may obtain a copy of the License at<br>" +
                "<br>" +
                "http://www.apache.org/licenses/LICENSE-2.0<br>" +
                "<br>" +
                "Unless required by applicable law or agreed to in writing, software<br>" +
                "distributed under the License is distributed on an \"AS IS\" BASIS,<br>" +
                "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>" +
                "See the License for the specific language governing permissions and<br>" +
                "limitations under the License.";
    }

    static String getMITLicense() {
        return "Licensed under the MIT License (MIT).<br>" +
                "<br>" +
                "Permission is hereby granted, free of charge, to any person obtaining a copy<br>" +
                "of this software and associated documentation files (the \"Software\"), to deal<br>" +
                "in the Software without restriction, including without limitation the rights<br>" +
                "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell<br>" +
                "copies of the Software, and to permit persons to whom the Software is<br>" +
                "furnished to do so, subject to the following conditions:<br>" +
                "<br>" +
                "The above copyright notice and this permission notice shall be included in all<br>" +
                "copies or substantial portions of the Software.<br>" +
                "<br>" +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR<br>" +
                "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,<br>" +
                "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE<br>" +
                "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER<br>" +
                "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,<br>" +
                "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE<br>" +
                "SOFTWARE.";
    }

    static String getGNULicense() {
        return "Licensed under the GNU General Public License, Version 3.0.<br>" +
                "<br>" +
                "This program is free software: you can redistribute it and/or modify<br>" +
                "it under the terms of the GNU General Public License as published by<br>" +
                "the Free Software Foundation, either version 3 of the License, or<br>" +
                "(at your option) any later version.<br>" +
                "<br>" +
                "This program is distributed in the hope that it will be useful,<br>" +
                "but WITHOUT ANY WARRANTY; without even the implied warranty of<br>" +
                "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>" +
                "GNU General Public License for more details.<br>" +
                "<br>" +
                "You should have received a copy of the GNU General Public License<br>" +
                "along with this program.  If not, see <http://www.gnu.org/licenses/>.";
    }

    static String getCreativeCommonsLicense() {
        return "Licensed under a Creative Commons 3.0 License.<br>" +
                "<br>" +
                "You must give appropriate credit, provide a link to the license, and indicate " +
                "if changes were made. You may do so in any reasonable manner, but not in any way " +
                "that suggests the licensor endorses you or your use.<br>" +
                "<br>" +
                "No additional restrictions — You may not apply legal terms or technological measures " +
                "that legally restrict others from doing anything the license permits." +
                "You do not have to comply with the license for elements of the material in" +
                " the public domain or where your use is permitted by an applicable exception or limitation.<br>" +
                "<br>" +
                "No warranties are given. The license may not give you all of the permissions necessary " +
                "for your intended use. For example, other rights such as publicity, privacy, or moral " +
                "rights may limit how you use the material." +
                "<br><br>For more info visit https://creativecommons.org/licenses/.";
    }

    static String getISCLicense() {
        return "Licensed under the ISC License (ISC).<br>" +
                "<br>" +
                "Permission to use, copy, modify, and/or distribute this software for any purpose " +
                "with or without fee is hereby granted, provided that the above copyright notice " +
                "and this permission notice appear in all copies.<br>" +
                "<br>" +
                "THE SOFTWARE IS PROVIDED \"AS IS\" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH " +
                "REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND " +
                "FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, " +
                "OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA " +
                "OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, " +
                "ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.";
    }

    static String getNTPLicense() {
        return "Licensed under the NTP License (NTP).<br>" +
                "<br>" +
                "Permission to use, copy, modify, and distribute this software and its documentation " +
                "for any purpose with or without fee is hereby granted, provided that the above " +
                "copyright notice appears in all copies and that both the copyright notice and this " +
                "permission notice appear in supporting documentation, and that the name (TrademarkedName) " +
                "not be used in advertising or publicity pertaining to distribution of the software without " +
                "specific, written prior permission. (TrademarkedName) makes no representations about the " +
                "suitability this software for any purpose. It is provided \"as is\" " +
                "without express or implied warranty.";
    }

    static String getApache1License() {
        return " Copyright (c) 1995-1999 The Apache Group.  All rights reserved" +
                "<br>" +
                "Redistribution and use in source and binary forms, with or without" +
                " modification, are permitted provided that the following conditions" +
                " are met: " +
                "<br>" +
                "1. Redistributions of source code must retain the above copyright" +
                " notice, this list of conditions and the following disclaimer." +
                "<br>" +
                "2. Redistributions in binary form must reproduce the above copyright" +
                " notice, this list of conditions and the following disclaimer in" +
                " the documentation and/or other materials provided with the" +
                " distribution." +
                "<br>" +
                "3. All advertising materials mentioning features or use of this" +
                " software must display the following acknowledgment:" +
                "<br>"+"This product includes software developed by the Apache Group" +
                " for use in the Apache HTTP server project (http://www.apache.org/)." +
                "<br>" +
                "4. The names Apache Server and Apache Group must not be used to" +
                " endorse or promote products derived from this software without" +
                " prior written permission. For written permission, please contact" +
                " apache@apache.org." +
                " <br>" +
                " 5. Products derived from this software may not be called Apache" +
                " nor may Apache appear in their names without prior written" +
                " permission of the Apache Group." +
                " <br>" +
                " 6. Redistributions of any form whatsoever must retain the following" +
                " acknowledgment: <br>" +
                " This product includes software developed by the Apache Group" +
                " for use in the Apache HTTP server project (http://www.apache.org/)." +
                " <br>" +
                " THIS SOFTWARE IS PROVIDED BY THE APACHE GROUP ``AS IS'' AND ANY" +
                " EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE" +
                " IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR" +
                " PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE APACHE GROUP OR" +
                " ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL," +
                " SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT" +
                " NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;" +
                " LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)" +
                " HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT," +
                " STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)" +
                " ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED" +
                " OF THE POSSIBILITY OF SUCH DAMAGE." +
                " <br>" +
                " This software consists of voluntary contributions made by many" +
                " individuals on behalf of the Apache Group and was originally based" +
                " on public domain software written at the National Center for" +
                " Supercomputing Applications, University of Illinois, Urbana-Champaign." +
                " For more information on the Apache Group and the Apache HTTP server" +
                " project, please see <http://www.apache.org/>.";
    }

    static String getApache11License() {
        return " The Apache Software License, Version 1.1" +
                "<br>" +
                "Copyright (c) 2000 The Apache Software Foundation.  All rights" +
                " reserved." +
                "<br>" +
                "Redistribution and use in source and binary forms, with or without" +
                " modification, are permitted provided that the following conditions" +
                " are met:" +
                "<br>" +
                "1. Redistributions of source code must retain the above copyright" +
                " notice, this list of conditions and the following disclaimer." +
                "<br>" +
                "2. Redistributions in binary form must reproduce the above copyright" +
                "notice, this list of conditions and the following disclaimer in" +
                "the documentation and/or other materials provided with the" +
                "distribution." +
                "<br>" +
                "3. The end-user documentation included with the redistribution," +
                " if any, must include the following acknowledgment:" +
                "<br>"+
                " This product includes software developed by the" +
                " Apache Software Foundation (http://www.apache.org/)." +
                " Alternately, this acknowledgment may appear in the software itself," +
                " if and wherever such third-party acknowledgments normally appear." +
                "<br>" +
                "4. The names \"Apache\" and \"Apache Software Foundation must" +
                " not be used to endorse or promote products derived from this" +
                " software without prior written permission. For written" +
                " permission, please contact apache@apache.org." +
                " " +
                "5. Products derived from this software may not be called Apache," +
                " nor may Apache appear in their name, without prior written" +
                " permission of the Apache Software Foundation." +
                "<br>" +
                " THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED" +
                " WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES" +
                " OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE" +
                " DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR" +
                " ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL," +
                " SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT" +
                " LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF" +
                " USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND" +
                " ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY," +
                " OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT" +
                " OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF" +
                " SUCH DAMAGE." +
                " <br>"+
                " This software consists of voluntary contributions made by many" +
                " individuals on behalf of the Apache Software Foundation.  For more" +
                " information on the Apache Software Foundation, please see" +
                " <http://www.apache.org/>." +
                "<br>" +
                " Portions of this software are based upon public domain software" +
                " originally written at the National Center for Supercomputing Applications," +
                " University of Illinois, Urbana-Champaign.";
    }

    static String getBSD3License() {
        return " Redistribution and use in source and binary forms, with or without" +
                "modification, are permitted provided that the following conditions are" +
                "met:" +
                "<br>" +
                " (1) Redistributions of source code must retain the above copyright" +
                " notice, this list of conditions and the following disclaimer. " +
                "<br>" +
                " (2) Redistributions in binary form must reproduce the above copyright" +
                " notice, this list of conditions and the following disclaimer in" +
                " the documentation and/or other materials provided with the" +
                " distribution." +
                "<br>" +
                " (3)The name of the author may not be used to" +
                " endorse or promote products derived from this software without" +
                " specific prior written permission." +
                "<br>" +
                "THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR" +
                "IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED" +
                "WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE" +
                "DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT," +
                "INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES" +
                "(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR" +
                "SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)" +
                "HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT," +
                "STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING" +
                "IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE" +
                "POSSIBILITY OF SUCH DAMAGE. ";
    }

    static String getBSD4License() {
        return "Copyright (c) 1993 The Regents of the University of California. All" +
                "rights reserved." +
                "<br>" +
                "This software was developed by the Computer Systems Engineering group" +
                "at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and" +
                "contributed to Berkeley." +
                "<br>" +
                "All advertising materials mentioning features or use of this software" +
                "must display the following acknowledgement: This product includes" +
                "software developed by the University of California, Lawrence Berkeley" +
                "Laboratory." +
                "<br>" +
                "Redistribution and use in source and binary forms, with or without" +
                "modification, are permitted provided that the following conditions are" +
                "met:" +
                "<br>" +
                "    1. Redistributions of source code must retain the above copyright" +
                "    notice, this list of conditions and the following disclaimer." +
                "<br>" +
                "    2. Redistributions in binary form must reproduce the above copyright" +
                "    notice, this list of conditions and the following disclaimer in" +
                "    the documentation and/or other materials provided with the" +
                "    distribution." +
                "<br>" +
                "    3. All advertising materials mentioning features or use of this" +
                "    software must display the following acknowledgement: This product" +
                "    includes software developed by the University of California," +
                "    Berkeley and its contributors." +
                "" +
                "    4. Neither the name of the University nor the names of its" +
                "    contributors may be used to endorse or promote products derived" +
                "    from this software without specific prior written permission." +
                "<br>" +
                "THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS''" +
                "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO," +
                "THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR" +
                "PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS" +
                "BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR" +
                "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF" +
                "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR" +
                "BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY," +
                "WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE" +
                "OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN" +
                "IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. ";
    }

    static String getFreeBSDLicense() {
        return "The FreeBSD Copyright" +
                "<br>" +
                "Copyright 1992-2012 The FreeBSD Project. All rights reserved." +
                "<br>" +
                "Redistribution and use in source and binary forms, with or without" +
                "modification, are permitted provided that the following conditions are" +
                "met:" +
                "<br>" +
                "1. Redistributions of source code must retain the above copyright notice," +
                "this list of conditions and the following disclaimer." +
                "<br>" +
                "2. Redistributions in binary form must reproduce the above copyright notice," +
                "this list of conditions and the following disclaimer in the documentation" +
                "and/or other materials provided with the distribution." +
                "<br>" +
                "THIS SOFTWARE IS PROVIDED BY THE FREEBSD PROJECT ``AS IS'' AND ANY EXPRESS" +
                "OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES" +
                "OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN" +
                "NO EVENT SHALL THE FREEBSD PROJECT OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT," +
                "INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES" +
                "(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;" +
                "LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND" +
                "ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT" +
                "(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF" +
                "THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE." +
                "<br>" +
                "The views and conclusions contained in the software and documentation" +
                "are those of the authors and should not be interpreted as representing" +
                "official policies, either expressed or implied, of the FreeBSD" +
                "Project. ";
    }

    static String getBSLLicense() {
        return "Boost Software License - Version 1.0 - August 17th, 2003" +
                "<br>" +
                "Permission is hereby granted, free of charge, to any person or organization" +
                "obtaining a copy of the software and accompanying documentation covered by" +
                "this license (the \"Software\") to use, reproduce, display, distribute," +
                "execute, and transmit the Software, and to prepare derivative works of the" +
                "Software, and to permit third-parties to whom the Software is furnished to" +
                "do so, all subject to the following:" +
                "<br>" +
                "The copyright notices in the Software and this entire statement, including" +
                "the above license grant, this restriction and the following disclaimer," +
                "must be included in all copies of the Software, in whole or in part, and" +
                "all derivative works of the Software, unless such copies or derivative" +
                "works are solely in the form of machine-executable object code generated by" +
                "a source language processor." +
                "<br>" +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR" +
                "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," +
                "FITNESS FOR A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. IN NO EVENT" +
                "SHALL THE COPYRIGHT HOLDERS OR ANYONE DISTRIBUTING THE SOFTWARE BE LIABLE" +
                "FOR ANY DAMAGES OR OTHER LIABILITY, WHETHER IN CONTRACT, TORT OR OTHERWISE," +
                "ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER" +
                "DEALINGS IN THE SOFTWARE. ";
    }

    static String getBSDPatentLicense() {
        return "Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:" +
                "<br>" +
                "1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer." +
                "<br>" +
                "2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in " +
                "the documentation and/or other materials provided with the distribution." +
                "<br>" +
                "Subject to the terms and conditions of this license, each copyright holder and contributor hereby grants to those receiving rights " +
                "under this license a perpetual, worldwide, non-exclusive, no-charge, royalty-free, irrevocable (except for failure to satisfy the " +
                "conditions of this license) patent license to make, have made, use, offer to sell, sell, import, and otherwise transfer this software," +
                " where such license applies only to those patent claims, already acquired or hereafter acquired, licensable by such copyright holder or " +
                "contributor that are necessarily infringed by:" +
                "<br>" +
                "(a) their Contribution(s) (the licensed copyrights of copyright holders and non-copyrightable additions of contributors, in source or binary form) alone; or" +
                "<br>" +
                "(b) combination of their Contribution(s) with the work of authorship to which such Contribution(s) was added by such copyright holder or contributor, " +
                "if, at the time the Contribution is added, such addition causes such combination to be necessarily infringed. The patent license shall not apply " +
                "to any other combinations which include the Contribution." +
                "<br>" +
                "Except as expressly stated above, no rights or licenses from any copyright holder or contributor is granted under this license, " +
                "whether expressly, by implication, estoppel or otherwise." +
                "<br>" +
                "DISCLAIMER" +
                "<br>" +
                "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, " +
                "BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL " +
                "THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES " +
                "(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) " +
                "HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) " +
                "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.";
    }

    static String getGNU2License() {
        return "This program is free software; you can redistribute it and/or" +
                "modify it under the terms of the GNU General Public License" +
                "as published by the Free Software Foundation; either version 2" +
                "of the License, or (at your option) any later version." +
                "<br>" +
                "This program is distributed in the hope that it will be useful," +
                "but WITHOUT ANY WARRANTY; without even the implied warranty of" +
                "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the" +
                "GNU General Public License for more details." +
                "<br>" +
                "You should have received a copy of the GNU General Public License" +
                "along with this program; if not, write to the Free Software" +
                "Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.";
    }

    static String getGNU21License() {
        return "" +
                "This library is free software; you can redistribute it and/or" +
                "modify it under the terms of the GNU Lesser General Public" +
                "License as published by the Free Software Foundation; either" +
                "version 2.1 of the License, or (at your option) any later version." +
                "<br>" +
                "This library is distributed in the hope that it will be useful," +
                "but WITHOUT ANY WARRANTY; without even the implied warranty of" +
                "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU" +
                "Lesser General Public License for more details." +
                "<br>" +
                "You should have received a copy of the GNU Lesser General Public" +
                "License along with this library; if not, write to the Free Software" +
                "Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA.";
    }


}
