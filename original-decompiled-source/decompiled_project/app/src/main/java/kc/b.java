package kc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBinder f16261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f16262h;

    public b(d dVar, IBinder iBinder) {
        this.f16262h = dVar;
        this.f16261g = iBinder;
    }

    @Override // kc.c0
    public final void b() throws RemoteException {
        e eVar = this.f16262h.f16266a;
        eVar.f16282n = (IInterface) eVar.f16277i.a(this.f16261g);
        b0 b0Var = eVar.f16270b;
        int i10 = 0;
        b0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f16282n.asBinder().linkToDeath(eVar.f16279k, 0);
        } catch (RemoteException e10) {
            b0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        eVar.f16275g = false;
        ArrayList arrayList = eVar.f16272d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        eVar.f16272d.clear();
    }
}
