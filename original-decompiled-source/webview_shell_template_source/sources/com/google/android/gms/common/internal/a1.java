package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a1 extends p3.a implements h {
    @Override // com.google.android.gms.common.internal.h
    public final Account zzb() {
        Parcel parcelN = n(2, r());
        Account account = (Account) p3.j.a(parcelN, Account.CREATOR);
        parcelN.recycle();
        return account;
    }
}
