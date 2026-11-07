package androidx.camera.core.processing;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.x;
import com.htmltoapk.template.u0;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import w2.y;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f618t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f619u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f620v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f621w;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.s = i6;
        this.f618t = obj;
        this.f619u = obj2;
        this.f620v = obj3;
        this.f621w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.s) {
            case 0:
                ((DefaultSurfaceProcessor) this.f618t).lambda$initGlRenderer$9((DynamicRange) this.f619u, (Map) this.f620v, (b.a) this.f621w);
                return;
            case 1:
                x xVar = (x) this.f618t;
                Surface surface = (Surface) this.f619u;
                b.d dVar = (b.d) this.f620v;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f621w;
                Logger.d("TextureViewImpl", "Safe to release surface.");
                androidx.camera.view.j jVar = xVar.f740l;
                if (jVar != null) {
                    jVar.a();
                    xVar.f740l = null;
                }
                surface.release();
                if (xVar.f736g == dVar) {
                    xVar.f736g = null;
                }
                if (xVar.h == surfaceRequest) {
                    xVar.h = null;
                    return;
                }
                return;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f618t;
                y.a aVar = (y.a) this.f619u;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f620v;
                PrintDocumentAdapter.WriteResultCallback writeResultCallback = (PrintDocumentAdapter.WriteResultCallback) this.f621w;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        FileInputStream fileInputStream = new FileInputStream(aVar.f15052a);
                        try {
                            byte[] bArr = new byte[65536];
                            while (!cancellationSignal.isCanceled()) {
                                int i6 = fileInputStream.read(bArr);
                                if (i6 < 0) {
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                    y.f15051a.post(new androidx.camera.core.y(7, writeResultCallback));
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i6);
                            }
                            y.f15051a.post(new androidx.activity.o(7, writeResultCallback));
                            fileInputStream.close();
                            fileOutputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e6) {
                    y.f15051a.post(new u0(4, writeResultCallback, e6));
                    return;
                }
        }
    }
}
