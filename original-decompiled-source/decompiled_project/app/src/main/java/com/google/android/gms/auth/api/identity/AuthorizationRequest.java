package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import ga.p;
import java.util.Arrays;
import java.util.List;
import qa.a;

/* loaded from: classes2.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final List f5838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5840c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5841d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f5842e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5843f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5844g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5845h;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f5846j;

    public AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12, Bundle bundle) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        com.google.android.gms.common.internal.p.a("requestedScopes cannot be null or empty", z13);
        this.f5838a = list;
        this.f5839b = str;
        this.f5840c = z10;
        this.f5841d = z11;
        this.f5842e = account;
        this.f5843f = str2;
        this.f5844g = str3;
        this.f5845h = z12;
        this.f5846j = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = authorizationRequest.f5838a;
        List list2 = this.f5838a;
        if (list2.size() == list.size() && list2.containsAll(list)) {
            Bundle bundle = authorizationRequest.f5846j;
            Bundle bundle2 = this.f5846j;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!o.a(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f5840c == authorizationRequest.f5840c && this.f5845h == authorizationRequest.f5845h && this.f5841d == authorizationRequest.f5841d && o.a(this.f5839b, authorizationRequest.f5839b) && o.a(this.f5842e, authorizationRequest.f5842e) && o.a(this.f5843f, authorizationRequest.f5843f) && o.a(this.f5844g, authorizationRequest.f5844g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5838a, this.f5839b, Boolean.valueOf(this.f5840c), Boolean.valueOf(this.f5845h), Boolean.valueOf(this.f5841d), this.f5842e, this.f5843f, this.f5844g, this.f5846j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, this.f5838a, false);
        c1.m(parcel, 2, this.f5839b, false);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f5840c ? 1 : 0);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f5841d ? 1 : 0);
        c1.l(parcel, 5, this.f5842e, i10, false);
        c1.m(parcel, 6, this.f5843f, false);
        c1.m(parcel, 7, this.f5844g, false);
        c1.s(parcel, 8, 4);
        parcel.writeInt(this.f5845h ? 1 : 0);
        c1.e(parcel, 9, this.f5846j, false);
        c1.r(iQ, parcel);
    }
}
