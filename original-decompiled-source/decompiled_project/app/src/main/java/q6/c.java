package q6;

import android.content.Context;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22063a;

    public c(Context context) {
        this.f22063a = context;
    }

    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        String str2 = null;
        if (str != null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                char c10 = '.';
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (!lowerCase.equals("gz")) {
                                c10 = 65535;
                                break;
                            } else {
                                c10 = 0;
                                break;
                            }
                        case 3401:
                            if (lowerCase.equals("js")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 108273:
                            if (lowerCase.equals("mp4")) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c10 = 16;
                                break;
                            }
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c10 = 17;
                                break;
                            }
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c10 = 18;
                                break;
                            }
                            break;
                        case 110834:
                            if (lowerCase.equals(ProjectKind.PDF)) {
                                c10 = 19;
                                break;
                            }
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c10 = 20;
                                break;
                            }
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c10 = 21;
                                break;
                            }
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c10 = 22;
                                break;
                            }
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c10 = 23;
                                break;
                            }
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c10 = 24;
                                break;
                            }
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c10 = 25;
                                break;
                            }
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c10 = 26;
                                break;
                            }
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c10 = 27;
                                break;
                            }
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c10 = 28;
                                break;
                            }
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c10 = 29;
                                break;
                            }
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c10 = 30;
                                break;
                            }
                            break;
                        case 3213227:
                            if (lowerCase.equals(ProjectKind.HTML)) {
                                c10 = 31;
                                break;
                            }
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c10 = ' ';
                                break;
                            }
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c10 = '!';
                                break;
                            }
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c10 = '\"';
                                break;
                            }
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c10 = '#';
                                break;
                            }
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c10 = '$';
                                break;
                            }
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c10 = '%';
                                break;
                            }
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c10 = '&';
                                break;
                            }
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c10 = '\'';
                                break;
                            }
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c10 = '(';
                                break;
                            }
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c10 = ')';
                                break;
                            }
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c10 = '*';
                                break;
                            }
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c10 = '+';
                                break;
                            }
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c10 = ',';
                                break;
                            }
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c10 = '-';
                                break;
                            }
                            break;
                        case 103877016:
                            if (!lowerCase.equals("mhtml")) {
                            }
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c10 = '/';
                                break;
                            }
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c10 = '0';
                                break;
                            }
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c10 = '1';
                                break;
                            }
                            break;
                    }
                    switch (c10) {
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
                        case '!':
                        case EACTags.PIN_USAGE_POLICY /* 47 */:
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
                        case 21:
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
                        case '\"':
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
                        case EACTags.DATE_OF_BIRTH /* 43 */:
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
