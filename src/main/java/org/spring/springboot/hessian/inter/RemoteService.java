package org.spring.springboot.hessian.inter;

import org.spring.springboot.hessian.bean.Info;

public interface RemoteService {

	Info method(Info info);
}
