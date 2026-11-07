package w2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.pdf.PdfRenderer;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.htmltoapk.template.R;
import java.util.Iterator;
import java.util.concurrent.Future;
import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f14895t;

    public /* synthetic */ e(t tVar, int i6) {
        this.s = i6;
        this.f14895t = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m0 m0Var;
        int i6;
        switch (this.s) {
            case 0:
                t tVar = this.f14895t;
                if (!tVar.K) {
                    tVar.U.setVisibility(8);
                    tVar.T.setText(R.string.pdf_document_error);
                    tVar.S.setVisibility(0);
                    p5.a<d5.j> aVar = tVar.f15019l0;
                    if (aVar != null) {
                        aVar.a();
                        break;
                    }
                }
                break;
            default:
                final t tVar2 = this.f14895t;
                if (!tVar2.K && tVar2.f15016i0 != 0) {
                    if (!tVar2.B.p0()) {
                        Iterator it = tVar2.G.iterator();
                        while (it.hasNext()) {
                            ((t.a) it.next()).r();
                        }
                        break;
                    } else if (tVar2.B.getScrollState() == 0) {
                        m0 m0VarR0 = tVar2.B.r0();
                        final float zoom = tVar2.B.getZoom();
                        int childCount = tVar2.B.getChildCount();
                        boolean z6 = false;
                        int i7 = 0;
                        while (i7 < childCount) {
                            View childAt = tVar2.B.getChildAt(i7);
                            c0 c0Var = childAt instanceof c0 ? (c0) childAt : null;
                            if (c0Var == null) {
                                m0Var = m0VarR0;
                                i6 = i7;
                            } else {
                                RecyclerView.b0 b0VarL = tVar2.B.L(c0Var);
                                final t.a aVar2 = b0VarL instanceof t.a ? (t.a) b0VarL : null;
                                if (aVar2 != null && aVar2.f15032v >= 0) {
                                    RectF pageBox = c0Var.getPageBox();
                                    float left = c0Var.getLeft() + pageBox.left;
                                    float top = c0Var.getTop() + pageBox.top;
                                    float left2 = c0Var.getLeft() + pageBox.right;
                                    float top2 = c0Var.getTop() + pageBox.bottom;
                                    float fMax = Math.max(m0VarR0.f14943a, left);
                                    float fMax2 = Math.max(m0VarR0.f14944b, top);
                                    float fMin = Math.min(m0VarR0.f14945c, left2);
                                    float fMin2 = Math.min(m0VarR0.f14946d, top2);
                                    if (fMin - fMax <= 0.0f || fMin2 - fMax2 <= 0.0f) {
                                        m0Var = m0VarR0;
                                        i6 = i7;
                                        aVar2.r();
                                    } else {
                                        final RectF rectF = new RectF(fMax - c0Var.getLeft(), fMax2 - c0Var.getTop(), fMin - c0Var.getLeft(), fMin2 - c0Var.getTop());
                                        if (c0Var.getDetail() == null || c0Var.getDetailZoom() != zoom || !c0Var.getDetailBox().contains(rectF)) {
                                            final RectF rectF2 = new RectF(pageBox);
                                            aVar2.f15034x++;
                                            Future<?> future = aVar2.f15036z;
                                            if (future != null) {
                                                future.cancel(z6);
                                            }
                                            final int i8 = aVar2.f15034x;
                                            final int i9 = aVar2.f15032v;
                                            final int iH = e5.i.h(rectF.width() * zoom);
                                            if (iH < 1) {
                                                iH = 1;
                                            }
                                            final int iH2 = e5.i.h(rectF.height() * zoom);
                                            if (iH2 < 1) {
                                                iH2 = 1;
                                            }
                                            i6 = i7;
                                            m0Var = m0VarR0;
                                            if (iH * iH2 <= 12000000) {
                                                aVar2.f15036z = tVar2.f15025u.submit(new Runnable() { // from class: w2.j
                                                    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
                                                    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
                                                    @Override // java.lang.Runnable
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void run() throws Throwable {
                                                        PdfRenderer pdfRenderer;
                                                        Throwable th;
                                                        Matrix matrix;
                                                        final Bitmap bitmapCreateBitmap;
                                                        final t tVar3 = tVar2;
                                                        final t.a aVar3 = aVar2;
                                                        final int i10 = i8;
                                                        final int i11 = i9;
                                                        RectF rectF3 = rectF2;
                                                        final float f6 = zoom;
                                                        int i12 = iH;
                                                        int i13 = iH2;
                                                        final RectF rectF4 = rectF;
                                                        Bitmap bitmap = null;
                                                        try {
                                                            if (!tVar3.K && aVar3.f15034x == i10 && (pdfRenderer = tVar3.H) != null) {
                                                                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i11);
                                                                try {
                                                                    float fWidth = rectF3.width();
                                                                    int width = pageOpenPage.getWidth();
                                                                    if (width < 1) {
                                                                        width = 1;
                                                                    }
                                                                    float f7 = (fWidth / width) * f6;
                                                                    matrix = new Matrix();
                                                                    matrix.setScale(f7, f7);
                                                                    matrix.postTranslate((-(rectF4.left - rectF3.left)) * f6, (-(rectF4.top - rectF3.top)) * f6);
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                                                                    bitmapCreateBitmap.eraseColor(-1);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                                try {
                                                                    pageOpenPage.render(bitmapCreateBitmap, null, matrix, 1);
                                                                    try {
                                                                        androidx.activity.c0.c(pageOpenPage, null);
                                                                        tVar3.f15024t.post(new Runnable() { // from class: w2.m
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                t tVar4 = tVar3;
                                                                                t.a aVar4 = aVar3;
                                                                                int i14 = i10;
                                                                                int i15 = i11;
                                                                                float f8 = f6;
                                                                                Bitmap bitmap2 = bitmapCreateBitmap;
                                                                                RectF rectF5 = rectF4;
                                                                                if (tVar4.K || aVar4.f15034x != i14 || aVar4.f15032v != i15 || tVar4.B.getZoom() != f8) {
                                                                                    bitmap2.recycle();
                                                                                    return;
                                                                                }
                                                                                aVar4.f15036z = null;
                                                                                c0 c0Var2 = aVar4.f15031u;
                                                                                RectF rectF6 = c0Var2.f14887x;
                                                                                Bitmap bitmap3 = c0Var2.f14886w;
                                                                                c0Var2.f14886w = bitmap2;
                                                                                rectF6.set(rectF5);
                                                                                c0Var2.f14888y = f8;
                                                                                c0Var2.invalidate();
                                                                                if (bitmap3 != null) {
                                                                                    bitmap3.recycle();
                                                                                }
                                                                            }
                                                                        });
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        bitmap = bitmapCreateBitmap;
                                                                        if (th instanceof Exception) {
                                                                        }
                                                                        Log.w("PdfDocumentView", "Cannot render PDF detail " + i11, th);
                                                                        if (bitmap == null) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    bitmap = bitmapCreateBitmap;
                                                                    try {
                                                                        throw th;
                                                                    } catch (Throwable th5) {
                                                                        androidx.activity.c0.c(pageOpenPage, th);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            if ((th instanceof Exception) && !(th instanceof OutOfMemoryError)) {
                                                                throw th;
                                                            }
                                                            Log.w("PdfDocumentView", "Cannot render PDF detail " + i11, th);
                                                            if (bitmap == null) {
                                                                bitmap.recycle();
                                                            }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                            }
                            i7 = i6 + 1;
                            m0VarR0 = m0Var;
                            z6 = false;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
