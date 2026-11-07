package na;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: classes2.dex */
public interface d extends IInterface {

    public static abstract class a extends zzb implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f18647a = 0;

        /* renamed from: na.d$a$a, reason: collision with other inner class name */
        public static class C0208a extends zza implements d {
            @Override // na.d
            public final void d(ma.c cVar, j jVar) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, jVar);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // na.d
            public final void p(ma.a aVar, i iVar) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, aVar);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iVar);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // na.d
            public final void r(ma.g gVar, k kVar) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, gVar);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, kVar);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }
    }

    void d(ma.c cVar, j jVar) throws RemoteException;

    void p(ma.a aVar, i iVar) throws RemoteException;

    void r(ma.g gVar, k kVar) throws RemoteException;
}
