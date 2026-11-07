package n3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements IInterface {
    public final IBinder s;

    public e(IBinder iBinder) {
        this.s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }
}
