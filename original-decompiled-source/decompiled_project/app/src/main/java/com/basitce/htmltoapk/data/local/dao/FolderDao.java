package com.basitce.htmltoapk.data.local.dao;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;

/* loaded from: classes.dex */
public interface FolderDao {

    public static final class DefaultImpls {
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            if (r5.deleteById(r6, r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object delete(FolderDao folderDao, long j10, tg.e<? super f0> eVar) {
            AnonymousClass1 anonymousClass1;
            if (eVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) eVar;
                int i10 = anonymousClass1.label;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    anonymousClass1.label = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    anonymousClass1 = new AnonymousClass1(eVar);
                }
            }
            Object obj = anonymousClass1.result;
            ug.a aVar = ug.a.f29706a;
            int i11 = anonymousClass1.label;
            if (i11 == 0) {
                pg.q.b(obj);
                anonymousClass1.L$0 = folderDao;
                anonymousClass1.J$0 = j10;
                anonymousClass1.label = 1;
                if (folderDao.releaseProjects(j10, anonymousClass1) != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return f0.f21461a;
            }
            j10 = anonymousClass1.J$0;
            folderDao = (FolderDao) anonymousClass1.L$0;
            pg.q.b(obj);
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object reorder(FolderDao folderDao, List<Long> list, tg.e<? super f0> eVar) {
            C03621 c03621;
            Iterator it;
            int i10;
            if (eVar instanceof C03621) {
                c03621 = (C03621) eVar;
                int i11 = c03621.label;
                if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                    c03621.label = i11 - PKIFailureInfo.systemUnavail;
                } else {
                    c03621 = new C03621(eVar);
                }
            }
            Object obj = c03621.result;
            ug.a aVar = ug.a.f29706a;
            int i12 = c03621.label;
            if (i12 == 0) {
                pg.q.b(obj);
                it = list.iterator();
                i10 = 0;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = c03621.I$0;
                it = (Iterator) c03621.L$1;
                FolderDao folderDao2 = (FolderDao) c03621.L$0;
                pg.q.b(obj);
                i10 = i13;
                folderDao = folderDao2;
            }
            while (it.hasNext()) {
                Object next = it.next();
                int i14 = i10 + 1;
                if (i10 < 0) {
                    qg.p.o();
                    throw null;
                }
                long jLongValue = ((Number) next).longValue();
                c03621.L$0 = folderDao;
                c03621.L$1 = it;
                c03621.I$0 = i14;
                c03621.label = 1;
                if (folderDao.setSortOrder(jLongValue, i10, c03621) == aVar) {
                    return aVar;
                }
                i10 = i14;
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.data.local.dao.FolderDao$DefaultImpls", f = "FolderDao.kt", l = {42, EACTags.DATE_OF_BIRTH}, m = "delete")
    /* renamed from: com.basitce.htmltoapk.data.local.dao.FolderDao$delete$1, reason: invalid class name */
    public static final class AnonymousClass1 extends vg.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(tg.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return DefaultImpls.delete(null, 0L, this);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.data.local.dao.FolderDao$DefaultImpls", f = "FolderDao.kt", l = {30}, m = "reorder")
    /* renamed from: com.basitce.htmltoapk.data.local.dao.FolderDao$reorder$1, reason: invalid class name and case insensitive filesystem */
    public static final class C03621 extends vg.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03621(tg.e<? super C03621> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return DefaultImpls.reorder(null, null, this);
        }
    }

    Object count(tg.e<? super Integer> eVar);

    Object delete(long j10, tg.e<? super f0> eVar);

    Object deleteById(long j10, tg.e<? super f0> eVar);

    sh.f<List<FolderEntity>> getAll();

    Object insert(FolderEntity folderEntity, tg.e<? super Long> eVar);

    Object releaseProjects(long j10, tg.e<? super f0> eVar);

    Object reorder(List<Long> list, tg.e<? super f0> eVar);

    Object setSortOrder(long j10, int i10, tg.e<? super f0> eVar);

    Object update(FolderEntity folderEntity, tg.e<? super f0> eVar);
}
