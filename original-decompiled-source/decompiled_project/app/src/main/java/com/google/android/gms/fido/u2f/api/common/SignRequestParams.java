package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import eb.a;
import eb.e;
import eb.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6242a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f6243b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f6244c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6245d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6246e;

    /* renamed from: f, reason: collision with root package name */
    public final a f6247f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6248g;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, a aVar, String str) {
        this.f6242a = num;
        this.f6243b = d10;
        this.f6244c = uri;
        this.f6245d = bArr;
        this.f6246e = arrayList;
        this.f6247f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e eVar = (e) obj;
                p.a("registered key has null appId and no request appId is provided", (eVar.f8659b == null && uri == null) ? false : true);
                String str2 = eVar.f8659b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        p.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f6248g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.f6246e;
        if (o.a(this.f6242a, signRequestParams.f6242a) && o.a(this.f6243b, signRequestParams.f6243b) && o.a(this.f6244c, signRequestParams.f6244c) && Arrays.equals(this.f6245d, signRequestParams.f6245d)) {
            List list2 = this.f6246e;
            if (list2.containsAll(list) && list.containsAll(list2) && o.a(this.f6247f, signRequestParams.f6247f) && o.a(this.f6248g, signRequestParams.f6248g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6242a, this.f6244c, this.f6243b, this.f6246e, this.f6247f, this.f6248g, Integer.valueOf(Arrays.hashCode(this.f6245d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.j(parcel, 2, this.f6242a);
        c1.g(parcel, 3, this.f6243b);
        c1.l(parcel, 4, this.f6244c, i10, false);
        c1.f(parcel, 5, this.f6245d, false);
        c1.p(parcel, 6, this.f6246e, false);
        c1.l(parcel, 7, this.f6247f, i10, false);
        c1.m(parcel, 8, this.f6248g, false);
        c1.r(iQ, parcel);
    }
}
