package hf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.Toast;
import java.util.HashMap;
import kotlin.jvm.internal.r;
import t2.j0;
import t2.k0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12990a = 9;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12991b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12992c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12993d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12994e = 15;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12995f = 48;

    public a() {
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public static final boolean a(e.c cVar, Context context, Object obj, int i10) {
        r.e(cVar, "<this>");
        r.e(context, "context");
        try {
            cVar.a(obj);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, i10, 1).show();
            return false;
        } catch (SecurityException unused2) {
            Toast.makeText(context, i10, 1).show();
            return false;
        }
    }

    public static final long c(long j10, long j11) {
        int iC;
        int iE = j0.e(j10);
        int iD = j0.d(j10);
        if ((j0.e(j11) < j0.d(j10)) && (j0.e(j10) < j0.d(j11))) {
            if ((j0.e(j11) <= j0.e(j10)) && (j0.d(j10) <= j0.d(j11))) {
                iE = j0.e(j11);
                iD = iE;
            } else {
                if ((j0.e(j10) <= j0.e(j11)) && (j0.d(j11) <= j0.d(j10))) {
                    iC = j0.c(j11);
                } else {
                    int iE2 = j0.e(j11);
                    if (iE >= j0.d(j11) || iE2 > iE) {
                        iD = j0.e(j11);
                    } else {
                        iE = j0.e(j11);
                        iC = j0.c(j11);
                    }
                }
                iD -= iC;
            }
        } else if (iD > j0.e(j11)) {
            iE -= j0.c(j11);
            iC = j0.c(j11);
            iD -= iC;
        }
        return k0.a(iE, iD);
    }

    public static final void d(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
