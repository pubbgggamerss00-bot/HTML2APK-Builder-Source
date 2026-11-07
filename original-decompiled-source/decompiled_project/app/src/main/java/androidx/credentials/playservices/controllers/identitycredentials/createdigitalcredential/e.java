package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import java.util.ArrayList;
import u6.r;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1598c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f1596a = i10;
        this.f1597b = obj;
        this.f1598c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1596a) {
            case 0:
                CreateDigitalCredentialController.handleResponse$lambda$3$0((CreateDigitalCredentialController) this.f1597b, (e4.g) this.f1598c);
                return;
            default:
                r rVar = (r) this.f1597b;
                c7.j jVar = (c7.j) this.f1598c;
                synchronized (rVar.f29326k) {
                    try {
                        ArrayList arrayList = rVar.f29325j;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((u6.e) obj).b(jVar, false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
