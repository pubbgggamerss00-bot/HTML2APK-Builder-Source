package j2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import l1.b;

/* loaded from: classes.dex */
public final class j0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f14770a = new j0();

    public final boolean onClearTranslation(View view) {
        q2.a aVar;
        eh.a aVar2;
        kotlin.jvm.internal.r.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.b contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16653f = b.a.f16663a;
        p.i<w4> iVarC = contentCaptureManager$ui_release.c();
        Object[] objArr = iVarC.f20645c;
        long[] jArr = iVarC.f20643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        q2.l lVar = ((w4) objArr[(i10 << 3) + i12]).f14962a.f21811d;
                        if (q2.m.a(lVar, q2.w.B) != null && (aVar = (q2.a) q2.m.a(lVar, q2.k.f21785m)) != null && (aVar2 = (eh.a) aVar.f21753b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        q2.a aVar;
        eh.l lVar;
        kotlin.jvm.internal.r.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.b contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16653f = b.a.f16663a;
        p.i<w4> iVarC = contentCaptureManager$ui_release.c();
        Object[] objArr = iVarC.f20645c;
        long[] jArr = iVarC.f20643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        q2.l lVar2 = ((w4) objArr[(i10 << 3) + i12]).f14962a.f21811d;
                        if (kotlin.jvm.internal.r.a(q2.m.a(lVar2, q2.w.B), Boolean.TRUE) && (aVar = (q2.a) q2.m.a(lVar2, q2.k.f21784l)) != null && (lVar = (eh.l) aVar.f21753b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        q2.a aVar;
        eh.l lVar;
        kotlin.jvm.internal.r.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.b contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16653f = b.a.f16664b;
        p.i<w4> iVarC = contentCaptureManager$ui_release.c();
        Object[] objArr = iVarC.f20645c;
        long[] jArr = iVarC.f20643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        q2.l lVar2 = ((w4) objArr[(i10 << 3) + i12]).f14962a.f21811d;
                        if (kotlin.jvm.internal.r.a(q2.m.a(lVar2, q2.w.B), Boolean.FALSE) && (aVar = (q2.a) q2.m.a(lVar2, q2.k.f21784l)) != null && (lVar = (eh.l) aVar.f21753b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
