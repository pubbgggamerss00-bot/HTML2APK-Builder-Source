package f1;

import android.content.Context;
import c2.y;
import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import g7.s;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r;
import pg.q;
import q1.e0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static m f8810a;

    public static final v1.c a(g7.l lVar, Context context, int i10) {
        return lVar instanceof g7.a ? y.a(new e0(((g7.a) lVar).f11477a), i10) : lVar instanceof g7.g ? new n9.b(s.a(lVar, context.getResources()).mutate()) : new h7.n(lVar);
    }

    public static final int b(long j10, long j11) {
        boolean zF = f(j10);
        if (zF != f(j11)) {
            return zF ? -1 : 1;
        }
        return (Math.min(c(j10), c(j11)) >= CropImageView.DEFAULT_ASPECT_RATIO && e(j10) != e(j11)) ? e(j10) ? -1 : 1 : (int) Math.signum(c(j10) - c(j11));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final void d(x0.k kVar, p pVar) {
        r.c(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        m0.b(2, pVar);
        pVar.invoke(kVar, 1);
    }

    public static final boolean e(long j10) {
        return (j10 & 2) != 0;
    }

    public static final boolean f(long j10) {
        return (j10 & 1) != 0;
    }

    public static final Object g(Object obj) {
        return obj instanceof ph.y ? q.a(((ph.y) obj).f21609a) : obj;
    }
}
