package b9;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements e.b, r1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4131a;

    public /* synthetic */ w(Object obj) {
        this.f4131a = obj;
    }

    @Override // e.b
    public void a(Object obj) {
        Integer numM;
        Integer numM2;
        int iIntValue;
        PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) this.f4131a;
        e.a result = (e.a) obj;
        int i10 = PdfPreviewActivity.f5788v;
        kotlin.jvm.internal.r.e(result, "result");
        if (result.f8086a == -1) {
            Intent intent = result.f8087b;
            int[] intArrayExtra = intent != null ? intent.getIntArrayExtra("pdf_edit_page_map") : null;
            m9.g0 g0Var = pdfPreviewActivity.f5792h;
            if (g0Var != null) {
                g0Var.h();
            }
            if (intArrayExtra != null) {
                SharedPreferences sharedPreferences = pdfPreviewActivity.getSharedPreferences("pdfviewer_" + m0.r.a("doc_", pdfPreviewActivity.j()), 0);
                int i11 = sharedPreferences.getInt("page", 0);
                jh.f it = jh.j.q(i11, intArrayExtra.length).iterator();
                while (true) {
                    if (!it.f15749c) {
                        numM = null;
                        break;
                    } else {
                        numM = PdfPreviewActivity.m(intArrayExtra, it.nextInt());
                        if (numM != null) {
                            break;
                        }
                    }
                }
                if (numM != null) {
                    iIntValue = numM.intValue();
                } else {
                    jh.f fVar = new jh.f(i11, b6.n.d(i11, 0, -1), -1);
                    while (true) {
                        if (!fVar.f15749c) {
                            numM2 = null;
                            break;
                        } else {
                            numM2 = PdfPreviewActivity.m(intArrayExtra, fVar.nextInt());
                            if (numM2 != null) {
                                break;
                            }
                        }
                    }
                    iIntValue = numM2 != null ? numM2.intValue() : 0;
                }
                String string = sharedPreferences.getString("bookmarks", null);
                if (string == null) {
                    string = "";
                }
                List listP = mh.x.P(string, new char[]{','});
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listP.iterator();
                while (it2.hasNext()) {
                    Integer numG = mh.s.g(mh.x.W((String) it2.next()).toString());
                    Integer numM3 = numG != null ? PdfPreviewActivity.m(intArrayExtra, numG.intValue()) : null;
                    if (numM3 != null) {
                        arrayList.add(numM3);
                    }
                }
                List listT = qg.x.T(qg.x.x(arrayList));
                SharedPreferences.Editor editorPutInt = sharedPreferences.edit().putInt("page", iIntValue);
                Integer numM4 = PdfPreviewActivity.m(intArrayExtra, i11);
                float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (numM4 != null && numM4.intValue() == iIntValue) {
                    f10 = sharedPreferences.getFloat("pageFraction", CropImageView.DEFAULT_ASPECT_RATIO);
                }
                editorPutInt.putFloat("pageFraction", f10).putString("bookmarks", qg.x.I(listT, ",", null, null, null, 62)).commit();
            }
            Toast.makeText(pdfPreviewActivity, R.string.pdf_edit_saved, 0).show();
            pdfPreviewActivity.f5799q = true;
            pdfPreviewActivity.recreate();
        }
    }

    @Override // r1.n
    public double b(double d10) {
        r1.a0 a0Var = (r1.a0) this.f4131a;
        float[] fArr = r1.j.f23075a;
        return r1.j.a(a0Var, d10);
    }
}
