package jh;

import b6.n;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements Iterable<Character>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f15735a;

    /* renamed from: b, reason: collision with root package name */
    public final char f15736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15737c = 1;

    public a(char c10, char c11) {
        this.f15735a = c10;
        this.f15736b = (char) n.d(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f15735a, this.f15736b, this.f15737c);
    }
}
