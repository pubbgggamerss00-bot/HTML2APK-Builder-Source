package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import qg.z;

/* loaded from: classes2.dex */
public final class RouteSelector {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f19514i = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Address f19515a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteDatabase f19516b;

    /* renamed from: c, reason: collision with root package name */
    public final Call f19517c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f19518d;

    /* renamed from: e, reason: collision with root package name */
    public final List<? extends Proxy> f19519e;

    /* renamed from: f, reason: collision with root package name */
    public int f19520f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19521g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f19522h;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19523a;

        /* renamed from: b, reason: collision with root package name */
        public int f19524b;

        public Selection(ArrayList arrayList) {
            this.f19523a = arrayList;
        }

        public final boolean a() {
            return this.f19524b < this.f19523a.size();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<? extends Proxy> listK;
        r.e(routeDatabase, "routeDatabase");
        r.e(eventListener, "eventListener");
        this.f19515a = address;
        this.f19516b = routeDatabase;
        this.f19517c = call;
        this.f19518d = eventListener;
        z zVar = z.f22752a;
        this.f19519e = zVar;
        this.f19521g = zVar;
        this.f19522h = new ArrayList();
        HttpUrl url = address.f19157h;
        r.e(url, "url");
        URI uriG = url.g();
        if (uriG.getHost() == null) {
            listK = Util.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = address.f19156g.select(uriG);
            listK = (listSelect == null || listSelect.isEmpty()) ? Util.k(Proxy.NO_PROXY) : Util.x(listSelect);
        }
        this.f19519e = listK;
        this.f19520f = 0;
    }

    public final boolean a() {
        return this.f19520f < this.f19519e.size() || !this.f19522h.isEmpty();
    }
}
