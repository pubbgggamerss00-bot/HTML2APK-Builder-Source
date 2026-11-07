package ic;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import j2.y;

/* loaded from: classes2.dex */
public class a extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        f fVar = (f) this;
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i12 = b.f14441a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(y.a(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        hc.h hVar = (hc.h) fVar;
        q qVar = hVar.f12983c.f12985a;
        if (qVar != null) {
            TaskCompletionSource taskCompletionSource = hVar.f12982b;
            synchronized (qVar.f14463f) {
                qVar.f14462e.remove(taskCompletionSource);
            }
            qVar.a().post(new l(qVar));
        }
        hVar.f12981a.a("onGetLaunchReviewFlowInfo", new Object[0]);
        hVar.f12982b.trySetResult(new hc.c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }
}
