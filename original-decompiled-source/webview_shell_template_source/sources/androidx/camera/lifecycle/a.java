package androidx.camera.lifecycle;

import android.content.res.Resources;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.view.j;
import c1.c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.AndroidAPI;
import com.htmltoapk.template.WebViewActivity;
import d5.e;
import java.io.File;
import org.json.JSONException;
import w2.q0;
import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f663t;

    public /* synthetic */ a(int i6, Object obj) {
        this.s = i6;
        this.f663t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, Resources.NotFoundException {
        switch (this.s) {
            case 0:
                ProcessCameraProvider.shutdownAsync$lambda$0((ProcessCameraProvider) this.f663t);
                break;
            case 1:
                ((j) this.f663t).a();
                break;
            case 2:
                AndroidAPI.printPage$lambda$88((AndroidAPI) this.f663t);
                break;
            case 3:
                ((WebViewActivity) this.f663t).hideSplash();
                break;
            case 4:
                View view = (View) this.f663t;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 5:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f663t;
                cVar.f12434b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                c cVar2 = sideSheetBehavior.f12418i;
                if (cVar2 != null && cVar2.f()) {
                    cVar.a(cVar.f12433a);
                    break;
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.s(cVar.f12433a);
                    break;
                }
                break;
            case 6:
                t tVar = (t) this.f663t;
                try {
                    PdfRenderer pdfRenderer = tVar.H;
                    if (pdfRenderer != null) {
                        pdfRenderer.close();
                    }
                } catch (Throwable th) {
                    e.a(th);
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptor = tVar.I;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th2) {
                    e.a(th2);
                }
                File file = tVar.J;
                if (file != null) {
                    file.delete();
                    break;
                }
                break;
            case 7:
                q0 q0Var = (q0) this.f663t;
                try {
                    PdfRenderer pdfRenderer2 = q0Var.f14976e;
                    if (pdfRenderer2 != null) {
                        pdfRenderer2.close();
                    }
                } catch (Throwable th3) {
                    e.a(th3);
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptor2 = q0Var.f14975d;
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                } catch (Throwable th4) {
                    e.a(th4);
                }
                q0Var.f14978g.evictAll();
                break;
            default:
                ((TextInputLayout) this.f663t).f12475w.requestLayout();
                break;
        }
    }
}
