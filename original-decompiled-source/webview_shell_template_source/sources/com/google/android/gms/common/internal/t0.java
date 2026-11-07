package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    public static void a(e eVar, Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        int i7 = eVar.s;
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        int i8 = eVar.f2434t;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i8);
        int i9 = eVar.f2435u;
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(i9);
        e5.i.m(parcel, 4, eVar.f2436v);
        e5.i.k(parcel, 5, eVar.f2437w);
        e5.i.p(parcel, 6, eVar.f2438x, i6);
        e5.i.i(parcel, 7, eVar.f2439y);
        e5.i.l(parcel, 8, eVar.f2440z, i6);
        e5.i.p(parcel, 10, eVar.A, i6);
        e5.i.p(parcel, 11, eVar.B, i6);
        boolean z6 = eVar.C;
        e5.i.r(parcel, 12, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i10 = eVar.D;
        e5.i.r(parcel, 13, 4);
        parcel.writeInt(i10);
        boolean z7 = eVar.E;
        e5.i.r(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        e5.i.m(parcel, 15, eVar.F);
        e5.i.t(iS, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = e.G;
        String strD = null;
        IBinder iBinderJ = null;
        Account account = null;
        String strD2 = null;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        boolean zI = false;
        int iK4 = 0;
        boolean zI2 = false;
        c3.d[] dVarArr = e.H;
        c3.d[] dVarArr2 = dVarArr;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 2:
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 3:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case 4:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 5:
                    iBinderJ = f3.b.j(i6, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) f3.b.g(parcel, i6, Scope.CREATOR);
                    break;
                case 7:
                    bundle = f3.b.a(i6, parcel);
                    break;
                case '\b':
                    account = (Account) f3.b.c(parcel, i6, Account.CREATOR);
                    break;
                case '\t':
                default:
                    f3.b.n(i6, parcel);
                    break;
                case '\n':
                    dVarArr = (c3.d[]) f3.b.g(parcel, i6, c3.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (c3.d[]) f3.b.g(parcel, i6, c3.d.CREATOR);
                    break;
                case '\f':
                    zI = f3.b.i(i6, parcel);
                    break;
                case '\r':
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case 14:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 15:
                    strD2 = f3.b.d(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new e(iK, iK2, iK3, strD, iBinderJ, scopeArr, bundle, account, dVarArr, dVarArr2, zI, iK4, zI2, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new e[i6];
    }
}
