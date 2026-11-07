package o3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a implements IInterface {
    public final IBinder s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14012t;

    public a(IBinder iBinder, String str) {
        this.s = iBinder;
        this.f14012t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }
}
