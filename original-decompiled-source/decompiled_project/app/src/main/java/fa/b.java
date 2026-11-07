package fa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.auth.zzbz;
import j2.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ua.a;

/* loaded from: classes2.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f11114f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11116b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f11117c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11118d;

    /* renamed from: e, reason: collision with root package name */
    public e f11119e;

    static {
        HashMap map = new HashMap();
        f11114f = map;
        map.put("authenticatorData", new a.C0303a(11, true, 11, true, "authenticatorData", 2, g.class));
        map.put("progress", new a.C0303a(11, false, 11, false, "progress", 4, e.class));
    }

    public b() {
        this.f11115a = new HashSet(1);
        this.f11116b = 1;
    }

    @Override // ua.a
    public final void addConcreteTypeArrayInternal(a.C0303a c0303a, String str, ArrayList arrayList) {
        int i10 = c0303a.f29669g;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i10), arrayList.getClass().getCanonicalName()));
        }
        this.f11117c = arrayList;
        this.f11115a.add(Integer.valueOf(i10));
    }

    @Override // ua.a
    public final void addConcreteTypeInternal(a.C0303a c0303a, String str, ua.a aVar) {
        int i10 = c0303a.f29669g;
        if (i10 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), aVar.getClass().getCanonicalName()));
        }
        this.f11119e = (e) aVar;
        this.f11115a.add(Integer.valueOf(i10));
    }

    @Override // ua.a
    public final /* synthetic */ Map getFieldMappings() {
        return f11114f;
    }

    @Override // ua.a
    public final Object getFieldValue(a.C0303a c0303a) {
        int i10 = c0303a.f29669g;
        if (i10 == 1) {
            return Integer.valueOf(this.f11116b);
        }
        if (i10 == 2) {
            return this.f11117c;
        }
        if (i10 == 4) {
            return this.f11119e;
        }
        throw new IllegalStateException(y.a(c0303a.f29669g, "Unknown SafeParcelable id="));
    }

    @Override // ua.a
    public final boolean isFieldSet(a.C0303a c0303a) {
        return this.f11115a.contains(Integer.valueOf(c0303a.f29669g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        HashSet hashSet = this.f11115a;
        if (hashSet.contains(1)) {
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11116b);
        }
        if (hashSet.contains(2)) {
            c1.p(parcel, 2, this.f11117c, true);
        }
        if (hashSet.contains(3)) {
            c1.s(parcel, 3, 4);
            parcel.writeInt(this.f11118d);
        }
        if (hashSet.contains(4)) {
            c1.l(parcel, 4, this.f11119e, i10, true);
        }
        c1.r(iQ, parcel);
    }

    public b(HashSet hashSet, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f11115a = hashSet;
        this.f11116b = i10;
        this.f11117c = arrayList;
        this.f11118d = i11;
        this.f11119e = eVar;
    }
}
