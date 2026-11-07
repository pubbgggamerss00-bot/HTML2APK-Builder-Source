package androidx.camera.camera2.interop;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraRepository;
import com.google.android.material.internal.CheckableImageButton;
import l.k;
import u0.c;
import u0.f0;
import w0.f;
import y.b;
import y4.m;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements b.c, ImageAnalysis.Analyzer, CheckableImageButton.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f492t;

    public /* synthetic */ g(int i6, Object obj) {
        this.s = i6;
        this.f492t = obj;
    }

    public boolean a(w0.f fVar, int i6, Bundle bundle) {
        c.b aVar;
        k kVar = (k) this.f492t;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 25 && (i6 & 1) != 0) {
            try {
                fVar.f14857a.b();
                Parcelable parcelable = (Parcelable) fVar.f14857a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        f.c cVar = fVar.f14857a;
        ClipData clipData = new ClipData(cVar.getDescription(), new ClipData.Item(cVar.a()));
        if (i7 >= 31) {
            aVar = new c.a(clipData, 2);
        } else {
            c.C0094c c0094c = new c.C0094c();
            c0094c.f14457a = clipData;
            c0094c.f14458b = 2;
            aVar = c0094c;
        }
        aVar.a(cVar.c());
        aVar.setExtras(bundle);
        return f0.i(kVar, aVar.build()) == null;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((ImageAnalysis.Analyzer) this.f492t).analyze(imageProxy);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((Camera2CameraControl) this.f492t).lambda$clearCaptureRequestOptions$5(aVar);
            default:
                return ((CameraRepository) this.f492t).lambda$deinit$0(aVar);
        }
    }

    @Override // com.google.android.material.internal.CheckableImageButton.a
    public void b() {
        com.google.android.material.textfield.a aVar = (com.google.android.material.textfield.a) this.f492t;
        CheckableImageButton checkableImageButton = aVar.f12494y;
        m.e(checkableImageButton, aVar.G, checkableImageButton.getContentDescription());
    }
}
