package ca;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5345b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f5346c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f5347d;

    public b(int i10, int i11, String str, Account account) {
        this.f5344a = i10;
        this.f5345b = i11;
        this.f5346c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f5347d = account;
        } else {
            this.f5347d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5344a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f5345b);
        c1.m(parcel, 3, this.f5346c, false);
        c1.l(parcel, 4, this.f5347d, i10, false);
        c1.r(iQ, parcel);
    }
}
