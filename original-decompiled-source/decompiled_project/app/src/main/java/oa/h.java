package oa;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final e f19090a;

    public h(e eVar) {
        this.f19090a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        final e eVar = this.f19090a;
        while (true) {
            synchronized (eVar) {
                try {
                    if (eVar.f19082a != 2) {
                        return;
                    }
                    if (eVar.f19085d.isEmpty()) {
                        eVar.c();
                        return;
                    }
                    final n<?> nVar = (n) eVar.f19085d.poll();
                    eVar.f19086e.put(nVar.f19098a, nVar);
                    eVar.f19087f.f19079b.schedule(new Runnable(eVar, nVar) { // from class: oa.j

                        /* renamed from: a, reason: collision with root package name */
                        public final e f19093a;

                        /* renamed from: b, reason: collision with root package name */
                        public final n f19094b;

                        {
                            this.f19093a = eVar;
                            this.f19094b = nVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar2 = this.f19093a;
                            int i10 = this.f19094b.f19098a;
                            synchronized (eVar2) {
                                n<?> nVar2 = eVar2.f19086e.get(i10);
                                if (nVar2 != null) {
                                    StringBuilder sb = new StringBuilder(31);
                                    sb.append("Timing out request: ");
                                    sb.append(i10);
                                    Log.w("MessengerIpcClient", sb.toString());
                                    eVar2.f19086e.remove(i10);
                                    nVar2.b(new m("Timed out waiting for response"));
                                    eVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(nVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = eVar.f19087f.f19078a;
                    Messenger messenger = eVar.f19083b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = nVar.f19100c;
                    messageObtain.arg1 = nVar.f19098a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", false);
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", nVar.f19101d);
                    messageObtain.setData(bundle);
                    try {
                        l lVar = eVar.f19084c;
                        Messenger messenger2 = lVar.f19096a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            b bVar = lVar.f19097b;
                            if (bVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = bVar.f19076a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        eVar.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
