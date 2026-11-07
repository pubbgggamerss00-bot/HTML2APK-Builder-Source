package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1632b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f1631a = i10;
        this.f1632b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1631a) {
            case 0:
                CreatePasswordCredentialController.invokePlayServices$lambda$0$0$0((CreatePasswordCredentialController) this.f1632b);
                break;
            default:
                ((CarouselLayoutManager) this.f1632b).U0();
                break;
        }
    }
}
