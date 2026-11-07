package androidx.camera.core.processing;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.emoji2.text.g;
import androidx.emoji2.text.n;
import com.google.android.material.carousel.CarouselLayoutManager;
import d1.a;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import l.f1;
import x0.c;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f633t;

    public /* synthetic */ p(int i6, Object obj) {
        this.s = i6;
        this.f633t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((SurfaceEdge) this.f633t).lambda$createSurfaceRequest$0();
                return;
            case 1:
                ((DualSurfaceProcessorNode) this.f633t).lambda$release$1();
                return;
            case 2:
                ((ImageCapture.ScreenFlashListener) this.f633t).onCompleted();
                return;
            case 3:
                n.b bVar = (n.b) this.f633t;
                synchronized (bVar.f1031d) {
                    try {
                        if (bVar.h == null) {
                            return;
                        }
                        try {
                            r0.l lVarC = bVar.c();
                            int i6 = lVarC.f14252e;
                            if (i6 == 2) {
                                synchronized (bVar.f1031d) {
                                }
                            }
                            if (i6 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                            }
                            try {
                                int i7 = q0.j.f14103a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                n.a aVar = bVar.f1030c;
                                Context context = bVar.f1028a;
                                aVar.getClass();
                                r0.l[] lVarArr = {lVarC};
                                m0.k kVar = m0.e.f13861a;
                                Trace.beginSection(d2.a.d("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceB = m0.e.f13861a.b(context, lVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferE = m0.l.e(bVar.f1028a, lVarC.f14248a);
                                    if (mappedByteBufferE == null || typefaceB == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(typefaceB, b0.g(mappedByteBufferE));
                                        Trace.endSection();
                                        synchronized (bVar.f1031d) {
                                            try {
                                                g.i iVar = bVar.h;
                                                if (iVar != null) {
                                                    iVar.b(oVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } finally {
                                        int i8 = q0.j.f14103a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (bVar.f1031d) {
                                try {
                                    g.i iVar2 = bVar.h;
                                    if (iVar2 != null) {
                                        iVar2.a(th2);
                                    }
                                    bVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 4:
                ((com.google.android.material.timepicker.f) this.f633t).h();
                return;
            case 5:
                ((p5.a) this.f633t).a();
                return;
            case 6:
                d1.a aVar2 = d1.a.this;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList<a.b> arrayList = aVar2.f12667b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    a.b bVar2 = arrayList.get(i9);
                    if (bVar2 != null) {
                        w.g<a.b, Long> gVar = aVar2.f12666a;
                        Long l4 = gVar.get(bVar2);
                        if (l4 == null) {
                            bVar2.a(jUptimeMillis);
                        } else if (l4.longValue() < jUptimeMillis2) {
                            gVar.remove(bVar2);
                            bVar2.a(jUptimeMillis);
                        }
                    }
                }
                if (aVar2.f12671f) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        a.c cVar = aVar2.h;
                        ValueAnimator.unregisterDurationScaleChangeListener(cVar.f12674a);
                        cVar.f12674a = null;
                    }
                    aVar2.f12671f = false;
                }
                if (arrayList.size() > 0) {
                    aVar2.f12670e.f12676a.postFrameCallback(new d1.c(aVar2.f12669d));
                    return;
                }
                return;
            case 7:
                ((CarouselLayoutManager) this.f633t).V0();
                return;
            case 8:
                ((f1) this.f633t).a();
                return;
            case 9:
                androidx.profileinstaller.c.b((Context) this.f633t, new q1.g(), androidx.profileinstaller.c.f1356a, false);
                return;
            case 10:
                c.a aVar3 = ((x0.c) this.f633t).f15113a;
                ViewParent parent = aVar3.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(aVar3);
                    return;
                }
                return;
            default:
                ((y4.c) this.f633t).s(true);
                return;
        }
    }
}
