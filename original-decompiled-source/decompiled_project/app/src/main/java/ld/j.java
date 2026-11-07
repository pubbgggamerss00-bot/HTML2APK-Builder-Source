package ld;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17002a;

    public /* synthetic */ j(l lVar) {
        this.f17002a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f17002a;
        i iVar = lVar.f17004a;
        iVar.f16999l.a().onSuccessTask(iVar.f16994g, new h(iVar)).addOnFailureListener(lVar.f17005b, new k(lVar));
    }
}
