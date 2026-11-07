package zh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f35075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List missingFields, String str, c cVar) {
        super(str, cVar);
        r.e(missingFields, "missingFields");
        this.f35075a = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String serialName, ArrayList arrayList) {
        String str;
        r.e(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, str, null);
    }
}
