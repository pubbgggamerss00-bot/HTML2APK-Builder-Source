package i2;

import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.internal.ads.dn;
import com.htmltoapk.template.WebViewActivity;
import java.net.URLConnection;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewActivity f13348a;

    public b(WebViewActivity webViewActivity) {
        this.f13348a = webViewActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        String str2 = null;
        if (str != null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                char c7 = '.';
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (!lowerCase.equals("gz")) {
                                c7 = 65535;
                                break;
                            } else {
                                c7 = 0;
                                break;
                            }
                        case 3401:
                            if (lowerCase.equals("js")) {
                                c7 = 1;
                                break;
                            }
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c7 = 2;
                                break;
                            }
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c7 = 3;
                                break;
                            }
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c7 = 4;
                                break;
                            }
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c7 = 5;
                                break;
                            }
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c7 = 6;
                                break;
                            }
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c7 = 7;
                                break;
                            }
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c7 = '\b';
                                break;
                            }
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c7 = '\t';
                                break;
                            }
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c7 = '\n';
                                break;
                            }
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c7 = 11;
                                break;
                            }
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c7 = '\f';
                                break;
                            }
                            break;
                        case 108273:
                            if (lowerCase.equals("mp4")) {
                                c7 = '\r';
                                break;
                            }
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c7 = 14;
                                break;
                            }
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c7 = 15;
                                break;
                            }
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c7 = 16;
                                break;
                            }
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c7 = 17;
                                break;
                            }
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c7 = 18;
                                break;
                            }
                            break;
                        case 110834:
                            if (lowerCase.equals("pdf")) {
                                c7 = 19;
                                break;
                            }
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c7 = 20;
                                break;
                            }
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c7 = 21;
                                break;
                            }
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c7 = 22;
                                break;
                            }
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c7 = 23;
                                break;
                            }
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c7 = 24;
                                break;
                            }
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c7 = 25;
                                break;
                            }
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c7 = 26;
                                break;
                            }
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c7 = 27;
                                break;
                            }
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c7 = 28;
                                break;
                            }
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c7 = 29;
                                break;
                            }
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c7 = 30;
                                break;
                            }
                            break;
                        case 3213227:
                            if (lowerCase.equals("html")) {
                                c7 = 31;
                                break;
                            }
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c7 = ' ';
                                break;
                            }
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c7 = '!';
                                break;
                            }
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c7 = '\"';
                                break;
                            }
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c7 = '#';
                                break;
                            }
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c7 = '$';
                                break;
                            }
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c7 = '%';
                                break;
                            }
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c7 = '&';
                                break;
                            }
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c7 = '\'';
                                break;
                            }
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c7 = '(';
                                break;
                            }
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c7 = ')';
                                break;
                            }
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c7 = '*';
                                break;
                            }
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c7 = '+';
                                break;
                            }
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c7 = ',';
                                break;
                            }
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c7 = '-';
                                break;
                            }
                            break;
                        case 103877016:
                            if (!lowerCase.equals("mhtml")) {
                            }
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c7 = '/';
                                break;
                            }
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c7 = '0';
                                break;
                            }
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c7 = '1';
                                break;
                            }
                            break;
                    }
                    switch (c7) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = "image/bmp";
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case '%':
                        case '-':
                        case '0':
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case ' ':
                        case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                        case '/':
                            str2 = "image/jpeg";
                            break;
                        case '\b':
                            str2 = "audio/x-m4a";
                            break;
                        case '\t':
                        case '\r':
                            str2 = "video/mp4";
                            break;
                        case '\n':
                        case '.':
                            str2 = "multipart/related";
                            break;
                        case '\f':
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case '#':
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case '$':
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            str2 = "video/ogg";
                            break;
                        case 19:
                            str2 = "application/pdf";
                            break;
                        case dn.zzm /* 21 */:
                            str2 = "image/png";
                            break;
                        case 22:
                        case '&':
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case '\'':
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case ',':
                        case '1':
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case 30:
                            str2 = "audio/flac";
                            break;
                        case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                            str2 = "application/json";
                            break;
                        case '(':
                            str2 = "application/wasm";
                            break;
                        case ')':
                            str2 = "video/webm";
                            break;
                        case '*':
                            str2 = "image/webp";
                            break;
                        case '+':
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = strGuessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }
}
