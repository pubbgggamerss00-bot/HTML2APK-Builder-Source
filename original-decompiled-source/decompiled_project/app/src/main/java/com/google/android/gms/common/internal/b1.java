package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class b1 implements Parcelable.Creator {
    public static void a(f fVar, Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        int i11 = fVar.f6121a;
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f6122b;
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f6123c;
        androidx.lifecycle.c1.s(parcel, 3, 4);
        parcel.writeInt(i13);
        androidx.lifecycle.c1.m(parcel, 4, fVar.f6124d, false);
        androidx.lifecycle.c1.h(parcel, 5, fVar.f6125e);
        androidx.lifecycle.c1.o(parcel, 6, fVar.f6126f, i10);
        androidx.lifecycle.c1.e(parcel, 7, fVar.f6127g, false);
        androidx.lifecycle.c1.l(parcel, 8, fVar.f6128h, i10, false);
        androidx.lifecycle.c1.o(parcel, 10, fVar.f6129j, i10);
        androidx.lifecycle.c1.o(parcel, 11, fVar.f6130k, i10);
        boolean z10 = fVar.f6131l;
        androidx.lifecycle.c1.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f6132m;
        androidx.lifecycle.c1.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f6133n;
        androidx.lifecycle.c1.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        androidx.lifecycle.c1.m(parcel, 15, fVar.f6134p, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = f.f6119q;
        String strF = null;
        IBinder iBinderM = null;
        Account account = null;
        String strF2 = null;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        boolean zK = false;
        int iN4 = 0;
        boolean zK2 = false;
        pa.c[] cVarArr = f.f6120r;
        pa.c[] cVarArr2 = cVarArr;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    iN2 = qa.b.n(i10, parcel);
                    break;
                case 3:
                    iN3 = qa.b.n(i10, parcel);
                    break;
                case 4:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 5:
                    iBinderM = qa.b.m(i10, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) qa.b.h(parcel, i10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = qa.b.b(i10, parcel);
                    break;
                case '\b':
                    account = (Account) qa.b.e(parcel, i10, Account.CREATOR);
                    break;
                case '\t':
                default:
                    qa.b.s(i10, parcel);
                    break;
                case '\n':
                    cVarArr = (pa.c[]) qa.b.h(parcel, i10, pa.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (pa.c[]) qa.b.h(parcel, i10, pa.c.CREATOR);
                    break;
                case '\f':
                    zK = qa.b.k(i10, parcel);
                    break;
                case '\r':
                    iN4 = qa.b.n(i10, parcel);
                    break;
                case 14:
                    zK2 = qa.b.k(i10, parcel);
                    break;
                case 15:
                    strF2 = qa.b.f(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new f(iN, iN2, iN3, strF, iBinderM, scopeArr, bundle, account, cVarArr, cVarArr2, zK, iN4, zK2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
