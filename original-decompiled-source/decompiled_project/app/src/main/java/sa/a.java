package sa;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24794c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f24793b = string;
        this.f24792a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f24792a, i10)) {
            i10++;
        }
        this.f24794c = i10;
    }

    public final void a(String str, Object... objArr) {
        if (this.f24794c <= 3) {
            Log.d(this.f24792a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f24792a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f24792a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f24793b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f24794c <= 2) {
            Log.v(this.f24792a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f24792a, d(str, objArr));
    }
}
