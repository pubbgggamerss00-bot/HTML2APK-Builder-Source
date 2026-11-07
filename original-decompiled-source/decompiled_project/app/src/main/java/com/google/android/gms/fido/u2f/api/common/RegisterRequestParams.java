package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import eb.a;
import eb.d;
import eb.e;
import eb.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6235a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f6236b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f6237c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6238d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6239e;

    /* renamed from: f, reason: collision with root package name */
    public final a f6240f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6241g;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, a aVar, String str) {
        this.f6235a = num;
        this.f6236b = d10;
        this.f6237c = uri;
        p.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f6238d = arrayList;
        this.f6239e = arrayList2;
        this.f6240f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            p.a("register request has null appId and no request appId is provided", (uri == null && dVar.f8657d == null) ? false : true);
            String str2 = dVar.f8657d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            e eVar = (e) obj2;
            p.a("registered key has null appId and no request appId is provided", (uri == null && eVar.f8659b == null) ? false : true);
            String str3 = eVar.f8659b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        p.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f6241g = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.f6239e;
        return o.a(this.f6235a, registerRequestParams.f6235a) && o.a(this.f6236b, registerRequestParams.f6236b) && o.a(this.f6237c, registerRequestParams.f6237c) && o.a(this.f6238d, registerRequestParams.f6238d) && (((list = this.f6239e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && o.a(this.f6240f, registerRequestParams.f6240f) && o.a(this.f6241g, registerRequestParams.f6241g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6235a, this.f6237c, this.f6236b, this.f6238d, this.f6239e, this.f6240f, this.f6241g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.j(parcel, 2, this.f6235a);
        c1.g(parcel, 3, this.f6236b);
        c1.l(parcel, 4, this.f6237c, i10, false);
        c1.p(parcel, 5, this.f6238d, false);
        c1.p(parcel, 6, this.f6239e, false);
        c1.l(parcel, 7, this.f6240f, i10, false);
        c1.m(parcel, 8, this.f6241g, false);
        c1.r(iQ, parcel);
    }
}
