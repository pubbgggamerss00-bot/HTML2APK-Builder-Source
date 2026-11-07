package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.r;
import mh.t;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public final class StatusLine {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f19544d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f19545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19547c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static StatusLine a(String statusLine) throws NumberFormatException, IOException {
            Protocol protocol;
            int i10;
            String strSubstring;
            r.e(statusLine, "statusLine");
            if (t.p(statusLine, "HTTP/1.", false)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!t.p(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                r.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i10, String message) {
        r.e(protocol, "protocol");
        r.e(message, "message");
        this.f19545a = protocol;
        this.f19546b = i10;
        this.f19547c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f19545a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f19546b);
        sb.append(' ');
        sb.append(this.f19547c);
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
