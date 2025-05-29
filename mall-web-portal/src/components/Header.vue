<template>
    <header class="navbar navbar-default header-top-bar">
        <div class="container">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="/"><i class="glyphicon glyphicon-map-marker glyphicon-map"></i>中国人民财产保险股份有限公司阿克苏分公司普惠金融业务部销售团队</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">王天宇,您好</a></li>
                    <li><a href="#">收藏夹</a></li>
                    <li class="line"></li>
                    <li><a href="#">我的需求</a></li>
                    <li class="line"></li>
                    <li><a href="#">我的订单</a></li>
                    <li class="line"></li>
                    <li><a href="#">我的地址</a></li>
                    <li class="line"></li>
                    <li><a href="#">客户服务</a></li>
                    <li class="line"></li>
                    <li><a href="#">意见建议</a></li>
                    <li class="line"></li>
                    <li><a href="#">帮助中心</a></li>
                </ul>
            </div>
        </div>
    </header>
  <div class="clearfix"></div>
    <div class="container-fluid search-wrapper">
        <div class="container  header-search">
            <div class="col-md-3 logo"><img src="/logo.jpg" alt="logo"></div>
            <div class="col-md-7 search">
                <div class="input-group">
                    <input type="text" class="form-control" id="search-input" placeholder="请输入搜索内容">
                    <span class="input-group-btn"><button class="btn btn-default" id="search-btn" type="button"><i
                            class="glyphicon glyphicon-search"></i></button></span>
                </div>
                <div id="hot-words"><a href="#">中性笔</a><a href="#">文件袋</a></div>
            </div>
            <div class="col-md-2 search-right">
                <button class="btn btn-default" id="cart-btn" @click="handleClick"><i
                        class="glyphicon glyphicon-shopping-cart"></i>购物车
                </button>
            </div>
        </div>
    </div>
    <div class="channel-navbar">
        <div class="container channel">
            <div class="row">
                <div class="col-md-2 cate-title"><i class="glyphicon glyphicon-th"></i>商品分类</div>
                <div class="col-md-9 channel-list">
                    <div class="col-md-1 channel-item"><a href="#">协议商品</a></div>
                    <div class="col-md-1 channel-item"><a href="#">营销用品</a></div>
                    <div class="col-md-1 channel-item"><a href="#">员工福利</a></div>
                    <div class="col-md-1 channel-item"><a href="#">三农扶贫</a></div>
                </div>
            </div>
        </div>
    </div>
    <!--分类 banner  工作区-->
    <div class="container">
        <div class="row content-wrapper">
            <div class="col-md-2" id="category-wrapper">
                <div class="category-left-item"><a href="#">办公文具</a> <span><a href="#">文件袋子</a></span><span><a href="#">文件袋子</a></span><span><a
                        href="#">文件袋子</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="category-left-item"><a @click="showCate">办公文具</a> <span><a href="#">文件袋</a></span><span><a
                        href="#">文件袋</a></span><span><a href="#">文件袋</a></span></div>
                <div class="row category-detail-items">
                    <div>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                        <span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span><span>办公用品</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6 swiper" id="banner-wrapper">
                <div class="swiper-wrapper">
                    <div class="swiper-slide"><a href="#"><img src="/images/banner1.jpg" alt="banner"></a></div>
                    <div class="swiper-slide"><a href="#"><img src="/images/banner1.jpg" alt="banner"></a></div>
                    <div class="swiper-slide">slide3</div>
                </div>
              <div id="banner-prev" class="banner-btn swiper-button-prev"></div><!--左箭头。如果放置在swiper外面，需要自定义样式。-->
              <div id="banner-next" class="banner-btn swiper-button-next"></div><!--右箭头。如果放置在swiper外面，需要自定义样式。-->
              <div class="swiper-pagination"></div>
            </div>

            <div class="col-md-3" id="work-wrapper">
                <div>王天宇,欢迎您</div>
                <div class="work-list">
                    <a class="work-list-item"><i class="glyphicon glyphicon-th-list"></i>
                        <div>我的待办</div>
                    </a>
                    <a class="work-list-item"><i class="glyphicon glyphicon-book"></i>
                        <div>我的需求</div>
                    </a>
                </div>
                <div class="work-notice">
                    公告资讯
                </div>
            </div>
        </div>

    </div>
</template>
<script setup>
    import {onMounted} from "vue"

    const handleClick = () => {
        alert(111)
    }
    const showCate = () => {

    }
    onMounted(() => {
        let mySwiper = new Swiper('.swiper', {
            autoplay:true,
            loop:true,
            navigation:{
                nextEl: '.swiper-button-next',
                prevEl: '.swiper-button-prev',
            },
            pagination:{
                el:'.swiper-pagination'
            }
        })
    })

</script>
