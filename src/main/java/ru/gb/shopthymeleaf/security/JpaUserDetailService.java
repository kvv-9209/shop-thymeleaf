//package ru.gb.shopthymeleaf.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import ru.gb.shopthymeleaf.dao.security.AccountUserDao;
//import ru.gb.shopthymeleaf.entity.security.AccountUser;
//
//@RequiredArgsConstructor
//@Service
//public class JpaUserDetailService implements UserDetailsService {
//
//    private final AccountUserDao accountUserDao;
//
////    @Override
////    @Transactional
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        AccountUser accountUser =  accountUserDao.findByUsername(username).orElseThrow(
////                () -> new UsernameNotFoundException("Username" + username + " not found")
////        );
//
//        return accountUser;
//    }
//}
