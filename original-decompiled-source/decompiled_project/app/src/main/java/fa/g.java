package fa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.auth.zzbz;
import j2.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ua.a;

/* loaded from: classes2.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f11127g;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11129b;

    /* renamed from: c, reason: collision with root package name */
    public i f11130c;

    /* renamed from: d, reason: collision with root package name */
    public String f11131d;

    /* renamed from: e, reason: collision with root package name */
    public String f11132e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11133f;

    static {
        HashMap map = new HashMap();
        f11127g = map;
        map.put("authenticatorInfo", new a.C0303a(11, false, 11, false, "authenticatorInfo", 2, i.class));
        map.put("signature", new a.C0303a(7, false, 7, false, "signature", 3, null));
        map.put("package", new a.C0303a(7, false, 7, false, "package", 4, null));
    }

    public g() {
        this.f11128a = new HashSet(3);
        this.f11129b = 1;
    }

    @Override // ua.a
    public final void addConcreteTypeInternal(a.C0303a c0303a, String str, ua.a aVar) {
        int i10 = c0303a.f29669g;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), aVar.getClass().getCanonicalName()));
        }
        this.f11130c = (i) aVar;
        this.f11128a.add(Integer.valueOf(i10));
    }

    @Override // ua.a
    public final /* synthetic */ Map getFieldMappings() {
        return f11127g;
    }

    @Override // ua.a
    public final Object getFieldValue(a.C0303a c0303a) {
        int i10 = c0303a.f29669g;
        if (i10 == 1) {
            return Integer.valueOf(this.f11129b);
        }
        if (i10 == 2) {
            return this.f11130c;
        }
        if (i10 == 3) {
            return this.f11131d;
        }
        if (i10 == 4) {
            return this.f11132e;
        }
        throw new IllegalStateException(y.a(c0303a.f29669g, "Unknown SafeParcelable id="));
    }

    @Override // ua.a
    public final boolean isFieldSet(a.C0303a c0303a) {
        return this.f11128a.contains(Integer.valueOf(c0303a.f29669g));
    }

    @Override // ua.a
    public final void setStringInternal(a.C0303a c0303a, String str, String str2) {
        int i10 = c0303a.f29669g;
        if (i10 == 3) {
            this.f11131d = str2;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
            }
            this.f11132e = str2;
        }
        this.f11128a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        HashSet hashSet = this.f11128a;
        if (hashSet.contains(1)) {
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11129b);
        }
        if (hashSet.contains(2)) {
            c1.l(parcel, 2, this.f11130c, i10, true);
        }
        if (hashSet.contains(3)) {
            c1.m(parcel, 3, this.f11131d, true);
        }
        if (hashSet.contains(4)) {
            c1.m(parcel, 4, this.f11132e, true);
        }
        if (hashSet.contains(5)) {
            c1.m(parcel, 5, this.f11133f, true);
        }
        c1.r(iQ, parcel);
    }

    public g(HashSet hashSet, int i10, i iVar, String str, String str2, String str3) {
        this.f11128a = hashSet;
        this.f11129b = i10;
        this.f11130c = iVar;
        this.f11131d = str;
        this.f11132e = str2;
        this.f11133f = str3;
    }
}
