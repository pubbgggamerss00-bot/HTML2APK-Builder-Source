package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import g2.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objL = remoteActionCompat.f957a;
        if (aVar.h(1)) {
            objL = aVar.l();
        }
        remoteActionCompat.f957a = (IconCompat) objL;
        CharSequence charSequenceG = remoteActionCompat.f958b;
        if (aVar.h(2)) {
            charSequenceG = aVar.g();
        }
        remoteActionCompat.f958b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.f959c;
        if (aVar.h(3)) {
            charSequenceG2 = aVar.g();
        }
        remoteActionCompat.f959c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.f960d;
        if (aVar.h(4)) {
            parcelableJ = aVar.j();
        }
        remoteActionCompat.f960d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.f961e;
        if (aVar.h(5)) {
            zE = aVar.e();
        }
        remoteActionCompat.f961e = zE;
        boolean zE2 = remoteActionCompat.f962f;
        if (aVar.h(6)) {
            zE2 = aVar.e();
        }
        remoteActionCompat.f962f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f957a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f958b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f959c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f960d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z6 = remoteActionCompat.f961e;
        aVar.m(5);
        aVar.n(z6);
        boolean z7 = remoteActionCompat.f962f;
        aVar.m(6);
        aVar.n(z7);
    }
}
