package org.jf.dexlib2.rewriter;

import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class RewriterUtils {
    public static <T> Iterable<T> rewriteIterable(final Rewriter<T> rewriter, final Iterable<? extends T> iterable) {
        return new Iterable<T>() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.3
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                final Iterator<T> it = iterable.iterator();
                return new Iterator<T>() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.3.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        return (T) RewriterUtils.rewriteNullable(rewriter, it.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        it.remove();
                    }
                };
            }
        };
    }

    public static <T> List<T> rewriteList(final Rewriter<T> rewriter, final List<? extends T> list) {
        return new AbstractList<T>() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.2
            @Override // java.util.AbstractList, java.util.List
            public T get(int i10) {
                return (T) RewriterUtils.rewriteNullable(rewriter, list.get(i10));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return list.size();
            }
        };
    }

    public static <T> T rewriteNullable(Rewriter<T> rewriter, T t3) {
        if (t3 == null) {
            return null;
        }
        return rewriter.rewrite(t3);
    }

    public static <T> Set<T> rewriteSet(final Rewriter<T> rewriter, final Set<? extends T> set) {
        return new AbstractSet<T>() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<T> iterator() {
                final Iterator it = set.iterator();
                return new Iterator<T>() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        return (T) RewriterUtils.rewriteNullable(rewriter, it.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        it.remove();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return set.size();
            }
        };
    }

    public static TypeReference rewriteTypeReference(final Rewriter<String> rewriter, final TypeReference typeReference) {
        return new BaseTypeReference() { // from class: org.jf.dexlib2.rewriter.RewriterUtils.4
            @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
            public String getType() {
                return (String) rewriter.rewrite(typeReference.getType());
            }
        };
    }
}
