package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import com.google.android.gms.tasks.OnSuccessListener;
import sd.z;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnSuccessListener, sd.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1603a;

    public /* synthetic */ h(Object obj) {
        this.f1603a = obj;
    }

    @Override // sd.d
    public Object b(z zVar) {
        return this.f1603a;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g) this.f1603a).invoke(obj);
    }
}
