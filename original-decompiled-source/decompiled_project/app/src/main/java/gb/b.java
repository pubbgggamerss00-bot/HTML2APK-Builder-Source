package gb;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;
import fb.m;
import fb.o0;
import gb.e;

/* loaded from: classes2.dex */
public interface b extends IInterface {

    public static abstract class a extends zzb implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f11906a = 0;

        /* renamed from: gb.b$a$a, reason: collision with other inner class name */
        public static class C0106a extends zza implements b {
            @Override // gb.b
            public final void F(e.c cVar, GetCredentialRequest getCredentialRequest, com.google.android.gms.common.api.c cVar2) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, cVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, getCredentialRequest);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar2);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // gb.b
            public final void i(e.b bVar, m mVar, com.google.android.gms.common.api.c cVar) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, bVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, mVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // gb.b
            public final void s(f fVar, fb.c cVar, com.google.android.gms.common.api.c cVar2) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, fVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar2);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // gb.b
            public final void w(g gVar, o0 o0Var, com.google.android.gms.common.api.c cVar) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, gVar);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, o0Var);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, cVar);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }
        }
    }

    void F(e.c cVar, GetCredentialRequest getCredentialRequest, com.google.android.gms.common.api.c cVar2) throws RemoteException;

    void i(e.b bVar, m mVar, com.google.android.gms.common.api.c cVar) throws RemoteException;

    void s(f fVar, fb.c cVar, com.google.android.gms.common.api.c cVar2) throws RemoteException;

    void w(g gVar, o0 o0Var, com.google.android.gms.common.api.c cVar) throws RemoteException;
}
