package bi;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.z;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4240a;

    /* renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4243d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4244e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4245f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4246g;

    public a(String serialName) {
        r.e(serialName, "serialName");
        this.f4240a = serialName;
        this.f4241b = z.f22752a;
        this.f4242c = new ArrayList();
        this.f4243d = new HashSet();
        this.f4244e = new ArrayList();
        this.f4245f = new ArrayList();
        this.f4246g = new ArrayList();
    }

    public static void a(a aVar, String elementName, f descriptor) {
        r.e(elementName, "elementName");
        r.e(descriptor, "descriptor");
        if (!aVar.f4243d.add(elementName)) {
            StringBuilder sbA = e.e.a("Element with name '", elementName, "' is already registered in ");
            sbA.append(aVar.f4240a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        aVar.f4242c.add(elementName);
        aVar.f4244e.add(descriptor);
        aVar.f4245f.add(z.f22752a);
        aVar.f4246g.add(false);
    }
}
