package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import ga.a0;
import java.util.Arrays;
import java.util.List;
import qa.a;

/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5849c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5850d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5852f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f5847a = pendingIntent;
        this.f5848b = str;
        this.f5849c = str2;
        this.f5850d = list;
        this.f5851e = str3;
        this.f5852f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.f5850d;
        List list2 = this.f5850d;
        return list2.size() == list.size() && list2.containsAll(list) && o.a(this.f5847a, saveAccountLinkingTokenRequest.f5847a) && o.a(this.f5848b, saveAccountLinkingTokenRequest.f5848b) && o.a(this.f5849c, saveAccountLinkingTokenRequest.f5849c) && o.a(this.f5851e, saveAccountLinkingTokenRequest.f5851e) && this.f5852f == saveAccountLinkingTokenRequest.f5852f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5847a, this.f5848b, this.f5849c, this.f5850d, this.f5851e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f5847a, i10, false);
        c1.m(parcel, 2, this.f5848b, false);
        c1.m(parcel, 3, this.f5849c, false);
        c1.n(parcel, 4, this.f5850d);
        c1.m(parcel, 5, this.f5851e, false);
        c1.s(parcel, 6, 4);
        parcel.writeInt(this.f5852f);
        c1.r(iQ, parcel);
    }
}
