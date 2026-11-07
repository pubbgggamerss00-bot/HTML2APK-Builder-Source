package androidx.camera.camera2.interop;

import android.widget.TextView;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.ump.ConsentInformation;
import com.htmltoapk.template.ConsentManager$backend$1;
import com.htmltoapk.template.R;
import d5.j;
import p5.l;
import w2.l0;
import w2.t;
import y.b;
import y4.m;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b.c, ImageReaderProxy.OnImageAvailableListener, ConsentInformation.a, l, CheckableImageButton.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f491t;

    public /* synthetic */ f(int i6, Object obj) {
        this.s = i6;
        this.f491t = obj;
    }

    @Override // com.google.android.ump.ConsentInformation.a
    public void a(b5.c cVar) {
        ConsentManager$backend$1.update$lambda$2((l) this.f491t, cVar);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((Camera2CameraControl) this.f491t).lambda$setCaptureRequestOptions$1(aVar);
            case 1:
            default:
                return Futures.lambda$nonCancellationPropagating$0((c5.a) this.f491t, aVar);
            case 2:
                return ((DeferrableSurface) this.f491t).lambda$new$1(aVar);
            case 3:
                return ((LiveDataObservable) this.f491t).lambda$fetchData$1(aVar);
        }
    }

    @Override // com.google.android.material.internal.CheckableImageButton.a
    public void b() {
        com.google.android.material.textfield.a aVar = (com.google.android.material.textfield.a) this.f491t;
        CheckableImageButton checkableImageButton = aVar.f12490u;
        m.e(checkableImageButton, aVar.f12493x, checkableImageButton.getContentDescription());
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        int iP;
        switch (this.s) {
            case 6:
                t tVar = (t) this.f491t;
                float fFloatValue = ((Float) obj).floatValue();
                int i6 = tVar.f15016i0;
                if (i6 <= 1) {
                    iP = 0;
                } else {
                    int i7 = i6 - 1;
                    iP = u5.d.p((int) ((u5.d.o(fFloatValue, 0.0f, 1.0f) * i7) + 0.5f), 0, i7);
                }
                LinearLayoutManager linearLayoutManager = tVar.C;
                linearLayoutManager.f1375x = u5.d.p(iP, 0, tVar.f15016i0 - 1);
                linearLayoutManager.f1376y = 0;
                LinearLayoutManager.d dVar = linearLayoutManager.f1377z;
                if (dVar != null) {
                    dVar.s = -1;
                }
                linearLayoutManager.n0();
                TextView textView = tVar.f15009b0;
                if (textView != null) {
                    textView.setText(tVar.getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(iP + 1), Integer.valueOf(tVar.f15016i0)));
                }
                break;
            default:
                l0 l0Var = (l0) this.f491t;
                ((Integer) obj).intValue();
                l0Var.m();
                break;
        }
        return j.f12745a;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((MetadataImageReader) this.f491t).lambda$new$0(imageReaderProxy);
    }
}
