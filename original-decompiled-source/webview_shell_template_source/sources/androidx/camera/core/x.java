package androidx.camera.core;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.button.MaterialButton;
import com.htmltoapk.template.WebViewActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f659t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f660u;

    public /* synthetic */ x(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f659t = obj;
        this.f660u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws FileNotFoundException {
        switch (this.s) {
            case 0:
                ((Preview.SurfaceProvider) this.f659t).onSurfaceRequested((SurfaceRequest) this.f660u);
                return;
            case 1:
                ((SurfaceRequest.TransformationInfoListener) this.f659t).onTransformationInfoUpdate((SurfaceRequest.TransformationInfo) this.f660u);
                return;
            case 2:
                ((CameraRepository) this.f659t).lambda$deinit$1((CameraInternal) this.f660u);
                return;
            case 3:
                Threads.lambda$runOnMainSync$0((Runnable) this.f659t, (CountDownLatch) this.f660u);
                return;
            case 4:
                ((DefaultSurfaceProcessor) this.f659t).lambda$onOutputSurface$4((SurfaceOutput) this.f660u);
                return;
            case 5:
                ((SurfaceProcessorWithExecutor) this.f659t).lambda$onInputSurface$0((SurfaceRequest) this.f660u);
                return;
            case 6:
                MaterialButton materialButton = (MaterialButton) this.f659t;
                Drawable drawable = (Drawable) this.f660u;
                int[] iArr = MaterialButton.f12105i0;
                materialButton.setIcon(drawable);
                return;
            case 7:
                WebViewActivity.AnonymousClass2.shouldOverrideUrlLoading$lambda$0((WebViewActivity) this.f659t, (WebView) this.f660u);
                return;
            default:
                p5.a aVar = (p5.a) this.f659t;
                final w2.t tVar = (w2.t) this.f660u;
                int i6 = 0;
                try {
                    final File file = (File) aVar.a();
                    if (tVar.K) {
                        throw new IllegalStateException("cancelled");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    tVar.I = parcelFileDescriptorOpen;
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                    tVar.H = pdfRenderer;
                    final int pageCount = pdfRenderer.getPageCount();
                    if (pageCount <= 0) {
                        throw new IllegalArgumentException("Empty PDF");
                    }
                    final SparseArray sparseArray = new SparseArray();
                    int iMin = Math.min(pageCount, 300);
                    for (int i7 = 0; i7 < iMin; i7++) {
                        if (tVar.K) {
                            throw new IllegalStateException("cancelled");
                        }
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i7);
                        try {
                            double height = pageOpenPage.getHeight();
                            int width = pageOpenPage.getWidth();
                            if (width < 1) {
                                width = 1;
                            }
                            sparseArray.put(i7, Double.valueOf(height / width));
                            androidx.activity.c0.c(pageOpenPage, null);
                        } finally {
                        }
                    }
                    tVar.f15024t.post(new Runnable() { // from class: w2.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            d5.c cVar;
                            SharedPreferences sharedPreferences;
                            boolean zBooleanValue;
                            t tVar2 = tVar;
                            File file2 = file;
                            int i8 = pageCount;
                            SparseArray sparseArray2 = sparseArray;
                            if (tVar2.K) {
                                return;
                            }
                            n0 n0Var = tVar2.s;
                            TreeSet<Integer> treeSet = tVar2.R;
                            s0 s0Var = tVar2.B;
                            o0 o0Var = tVar2.f15026v;
                            tVar2.f15015h0 = file2;
                            tVar2.f15016i0 = i8;
                            int size = sparseArray2.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                tVar2.E.put(sparseArray2.keyAt(i9), sparseArray2.valueAt(i9));
                            }
                            Double d7 = (Double) sparseArray2.get(0);
                            tVar2.F = d7 != null ? d7.doubleValue() : tVar2.F;
                            treeSet.clear();
                            SharedPreferences sharedPreferences2 = o0Var.f14967a;
                            String string = sharedPreferences2 != null ? sharedPreferences2.getString("bookmarks", null) : null;
                            if (string == null) {
                                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            List listB = x5.o.B(string, new char[]{','});
                            ArrayList arrayList = new ArrayList();
                            Iterator it = listB.iterator();
                            while (it.hasNext()) {
                                Integer numI = x5.k.i(x5.o.G((String) it.next()).toString());
                                if (numI != null) {
                                    arrayList.add(numI);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = arrayList.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                int iIntValue = ((Number) obj).intValue();
                                if (iIntValue >= 0 && iIntValue < i8) {
                                    arrayList2.add(obj);
                                }
                            }
                            e5.p.e(treeSet, e5.q.i(e5.q.f(arrayList2)));
                            int i11 = tVar2.M;
                            if (i11 >= 0) {
                                cVar = new d5.c(Integer.valueOf(i11), Float.valueOf(tVar2.N));
                            } else if (n0Var.f14956d && (sharedPreferences = o0Var.f14967a) != null && sharedPreferences.contains("page")) {
                                SharedPreferences sharedPreferences3 = o0Var.f14967a;
                                Integer numValueOf = Integer.valueOf(sharedPreferences3 != null ? sharedPreferences3.getInt("page", 0) : 0);
                                SharedPreferences sharedPreferences4 = o0Var.f14967a;
                                cVar = new d5.c(numValueOf, Float.valueOf(sharedPreferences4 != null ? sharedPreferences4.getFloat("pageFraction", 0.0f) : 0.0f));
                            } else {
                                cVar = new d5.c(Integer.valueOf(n0Var.f14962k - 1), Float.valueOf(0.0f));
                            }
                            int iIntValue2 = ((Number) cVar.s).intValue();
                            float fFloatValue = ((Number) cVar.f12739t).floatValue();
                            Boolean bool = tVar2.O;
                            if (bool != null && (zBooleanValue = bool.booleanValue()) != tVar2.f15017j0) {
                                tVar2.setNight(zBooleanValue);
                            }
                            tVar2.S.setVisibility(8);
                            LinearLayout linearLayout = tVar2.f15008a0;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                            z zVar = tVar2.W;
                            if (zVar != null) {
                                zVar.setPageCount(i8);
                            }
                            tVar2.D.f1459a.b();
                            int iP = u5.d.p(iIntValue2, 0, i8 - 1);
                            if (s0Var.getWidth() > 0) {
                                tVar2.k(fFloatValue, iP);
                            } else {
                                s0Var.addOnLayoutChangeListener(new v(tVar2, iP, fFloatValue));
                            }
                            s0Var.post(new p(tVar2, 0));
                        }
                    });
                    return;
                } catch (Exception e6) {
                    Log.w("PdfDocumentView", "Cannot open PDF", e6);
                    tVar.f15024t.post(new w2.e(tVar, i6));
                    return;
                }
        }
    }
}
