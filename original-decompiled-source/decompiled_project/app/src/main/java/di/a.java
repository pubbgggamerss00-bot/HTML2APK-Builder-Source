package di;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7981a = 0;

    public static final byte a(char c10) {
        if (c10 < '~') {
            return j.f8031b[c10];
        }
        return (byte) 0;
    }

    public static final String b(int i10, x0.j jVar) {
        jVar.f(AndroidCompositionLocals_androidKt.f1280a);
        return ((Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b)).getResources().getString(i10);
    }

    public static final String c(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
