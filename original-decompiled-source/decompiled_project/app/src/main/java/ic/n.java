package ic;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f14453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14454c;

    public n(p pVar, IBinder iBinder) {
        this.f14453b = iBinder;
        this.f14454c = pVar;
    }

    @Override // ic.h
    public final void a() throws RemoteException {
        e cVar;
        q qVar = this.f14454c.f14456a;
        int i10 = d.f14443a;
        IBinder iBinder = this.f14453b;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            cVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new c(iBinder);
        }
        qVar.f14470m = cVar;
        g gVar = qVar.f14459b;
        int i11 = 0;
        gVar.a("linkToDeath", new Object[0]);
        try {
            qVar.f14470m.asBinder().linkToDeath(qVar.f14467j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", g.c(gVar.f14444a, "linkToDeath failed", objArr), e10);
            }
        }
        qVar.f14464g = false;
        ArrayList arrayList = qVar.f14461d;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
        qVar.f14461d.clear();
    }
}
