package r8;

import b.k;
import com.basitce.htmltoapk.ui.crop.CropActivity;

/* loaded from: classes.dex */
public final class d implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f23248a;

    public d(CropActivity cropActivity) {
        this.f23248a = cropActivity;
    }

    @Override // d.b
    public final void a(k kVar) {
        CropActivity cropActivity = this.f23248a;
        if (cropActivity.f23252d) {
            return;
        }
        cropActivity.f23252d = true;
        ((c) cropActivity.generatedComponent()).c(cropActivity);
    }
}
