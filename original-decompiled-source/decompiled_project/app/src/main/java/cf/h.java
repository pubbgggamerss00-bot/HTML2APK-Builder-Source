package cf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5438b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List<df.j> f5439a;

    public h(InputStream inputStream, List<df.j> list) {
        super(inputStream);
        this.f5439a = list;
    }
}
