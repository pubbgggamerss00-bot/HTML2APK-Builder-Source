package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import o6.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objL = remoteActionCompat.f1392a;
        if (aVar.h(1)) {
            objL = aVar.l();
        }
        remoteActionCompat.f1392a = (IconCompat) objL;
        CharSequence charSequenceG = remoteActionCompat.f1393b;
        if (aVar.h(2)) {
            charSequenceG = aVar.g();
        }
        remoteActionCompat.f1393b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.f1394c;
        if (aVar.h(3)) {
            charSequenceG2 = aVar.g();
        }
        remoteActionCompat.f1394c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.f1395d;
        if (aVar.h(4)) {
            parcelableJ = aVar.j();
        }
        remoteActionCompat.f1395d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.f1396e;
        if (aVar.h(5)) {
            zE = aVar.e();
        }
        remoteActionCompat.f1396e = zE;
        boolean zE2 = remoteActionCompat.f1397f;
        if (aVar.h(6)) {
            zE2 = aVar.e();
        }
        remoteActionCompat.f1397f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1392a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1393b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1394c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1395d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z10 = remoteActionCompat.f1396e;
        aVar.m(5);
        aVar.n(z10);
        boolean z11 = remoteActionCompat.f1397f;
        aVar.m(6);
        aVar.n(z11);
    }
}
