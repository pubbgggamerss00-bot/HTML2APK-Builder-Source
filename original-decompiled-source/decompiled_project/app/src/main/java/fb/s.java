package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import androidx.room.z0;

/* loaded from: classes2.dex */
public final class s extends qa.a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f11164a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11165b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11166c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11167d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11168e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11169f;

    public s(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.r.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.r.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.r.e(requestType, "requestType");
        kotlin.jvm.internal.r.e(protocolType, "protocolType");
        this.f11164a = type;
        this.f11165b = credentialRetrievalData;
        this.f11166c = candidateQueryData;
        this.f11167d = requestMatcher;
        this.f11168e = requestType;
        this.f11169f = protocolType;
        boolean z10 = (mh.x.A(requestType) || mh.x.A(protocolType)) ? false : true;
        boolean z11 = !mh.x.A(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z10 || z11) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(protocolType).length() + String.valueOf(type).length() + 31 + String.valueOf(requestType).length() + 19 + 69);
        z0.a(sb, "Either type: ", type, ", or requestType: ", requestType);
        sb.append(" and protocolType: ");
        sb.append(protocolType);
        sb.append(" must be specified, but at least one contains an invalid blank value.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.m(dest, 1, this.f11164a, false);
        c1.e(dest, 2, this.f11165b, false);
        c1.e(dest, 3, this.f11166c, false);
        c1.m(dest, 4, this.f11167d, false);
        c1.m(dest, 5, this.f11168e, false);
        c1.m(dest, 6, this.f11169f, false);
        c1.r(iQ, dest);
    }
}
