package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.i;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2825b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final b f2826c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final a f2827d = new a();

    public static final class a extends i.a {
        public a() {
            attachInterface(this, i.f2983h);
        }

        @Override // androidx.room.i
        public final void D(int i10, String[] tables) {
            kotlin.jvm.internal.r.e(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f2826c) {
                String str = (String) multiInstanceInvalidationService.f2825b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f2826c.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f2826c.getBroadcastCookie(i11);
                        kotlin.jvm.internal.r.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f2825b.get(num);
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                multiInstanceInvalidationService.f2826c.getBroadcastItem(i11).f(tables);
                                pg.f0 f0Var = pg.f0.f21461a;
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.f2826c.finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.f2826c.finishBroadcast();
                pg.f0 f0Var2 = pg.f0.f21461a;
            }
        }

        @Override // androidx.room.i
        public final void E(h callback, int i10) {
            kotlin.jvm.internal.r.e(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f2826c) {
                multiInstanceInvalidationService.f2826c.unregister(callback);
            }
        }

        @Override // androidx.room.i
        public final int k(h callback, String str) {
            kotlin.jvm.internal.r.e(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f2826c) {
                try {
                    int i11 = multiInstanceInvalidationService.f2824a + 1;
                    multiInstanceInvalidationService.f2824a = i11;
                    if (multiInstanceInvalidationService.f2826c.register(callback, Integer.valueOf(i11))) {
                        multiInstanceInvalidationService.f2825b.put(Integer.valueOf(i11), str);
                        i10 = i11;
                    } else {
                        multiInstanceInvalidationService.f2824a--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }
    }

    public static final class b extends RemoteCallbackList<h> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            h callback = (h) iInterface;
            kotlin.jvm.internal.r.e(callback, "callback");
            kotlin.jvm.internal.r.e(cookie, "cookie");
            MultiInstanceInvalidationService.this.f2825b.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.r.e(intent, "intent");
        return this.f2827d;
    }
}
